package cn.dongyeshengzhen.framework.security.web;

import cn.publink.app.RegionService.service.RegionServiceManager;
import cn.publink.app.tasks.entity.Employee;
import cn.publink.framework.appconfig.entity.Position;
import cn.publink.framework.appconfig.entity.Productline;
import cn.publink.framework.appconfig.entity.ServiceArea;
import cn.publink.framework.appconfig.service.PositionManager;
import cn.publink.framework.appconfig.service.ProductlineManager;
import cn.publink.framework.appconfig.service.ServiceAreaManager;
import cn.publink.framework.security.entity.Org;
import cn.publink.framework.security.entity.Role;
import cn.publink.framework.security.entity.User;
import cn.publink.framework.security.service.OrgManager;
import cn.publink.framework.security.service.RoleManager;
import cn.publink.framework.security.service.UserManager;
import cn.publink.framework.utils.FileSystemUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * 用户管理Controller
 *
 * @author yuqs
 * @since 0.1
 */
@Controller
@RequestMapping(value = "/security/user")
public class UserController {
    //注入用户管理对象
    @Autowired
    private UserManager userManager;
    //注入角色管理对象
    @Autowired
    private RoleManager roleManager;
    @Autowired
    private OrgManager orgManager;

    @Value("#{propertiesReader[avatar_upload_path]}")
    private String avatarUploadPath;
    @Autowired
    private PositionManager positionManager;
    @Autowired
    private ProductlineManager productlineManager;
    @Autowired
    private ServiceAreaManager serviceAreaManager;
    @Autowired
    private RegionServiceManager regionServiceManager;

    /**
     * 分页查询用户，返回用户列表视图
     *
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String list(Model model,
                       @RequestParam(value = "keyword", defaultValue = "")
                               String keyword,
                       @RequestParam(value = "pageNumber", defaultValue = "0")
                               int pageNumber,
                       @RequestParam(value = "pageSize", defaultValue = "10")
                               int pageSize, HttpServletRequest request) {
        Page<User> page = userManager.findPage(pageNumber, pageSize, keyword);
        model.addAttribute("page", page);
        model.addAttribute("keyword", keyword);
        return "security/userList";
    }

    /**
     * 新建用户时，返回用户编辑视图
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roles", roleManager.getAll());
        model.addAttribute("orgs", orgManager.getAll());
        model.addAttribute("positions", positionManager.getAll());
        //crm用户列表
        model.addAttribute("employees", userManager.findAll());
        model.addAttribute("isCreate", true);
        return "security/userEdit";
    }

    /**
     * 编辑用户时，返回用户编辑视图
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "update/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") Long id, Model model) {
        User entity = userManager.get(id);
        List<Role> roles = roleManager.getAll();
        List<Role> roless = entity.getRoles();
        for (Role role : roles) {
            for (Role selRole : roless) {
                if (role.getId().longValue() == selRole.getId().longValue()) {
                    role.setSelected(1);
                }
                if (role.getSelected() == null) {
                    role.setSelected(0);
                }
            }
        }
        List<Position> positions = positionManager.getAll();
        List<Position> positionss = entity.getPositions();
        for (Position ponsition : positions) {
            for (Position selponsition : positionss) {
                if (ponsition.getId().longValue() == selponsition.getId().longValue()) {
                    ponsition.setSelected(1);
                }
                if (ponsition.getSelected() == null) {
                    ponsition.setSelected(0);
                }
            }
        }
        //crm用户列表
        List<Employee> employees = userManager.findAll();
        model.addAttribute("user", userManager.get(id));
        model.addAttribute("roles", roles);
        model.addAttribute("positions", positions);
        model.addAttribute("employees", employees);
        model.addAttribute("orgs", orgManager.getAll());
        model.addAttribute("isCreate", false);
        return "security/userEdit";
    }

    /**
     * 编辑用户时，返回用户查看视图
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "view/{id}", method = RequestMethod.GET)
    public String view(@PathVariable("id") Long id, Model model) {
        User entity = userManager.get(id);
        List<Role> roles = roleManager.getAll();
        List<Role> roless = entity.getRoles();
        for (Role role : roles) {
            for (Role selRole : roless) {
                if (role.getId().longValue() == selRole.getId().longValue()) {
                    role.setSelected(1);
                }
                if (role.getSelected() == null) {
                    role.setSelected(0);
                }
            }
        }
        List<Position> positions = positionManager.getAll();
        List<Position> positionss = entity.getPositions();
        for (Position ponsition : positions) {
            for (Position selponsition : positionss) {
                if (ponsition.getId().longValue() == selponsition.getId().longValue()) {
                    ponsition.setSelected(1);
                }
                if (ponsition.getSelected() == null) {
                    ponsition.setSelected(0);
                }
            }
        }
        model.addAttribute("user", userManager.get(id));
        model.addAttribute("roles", roles);
        model.addAttribute("positions", positions);
        model.addAttribute("orgs", orgManager.getAll());
        model.addAttribute("employee", userManager.findEmployee(entity.getEmpId()));
        model.addAttribute("regionServices", regionServiceManager.findRegionService());
        return "security/userView";
    }

    /**
     * 新增、编辑用户页面的提交处理。保存用户实体，并返回用户列表视图
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(User user, Long[] orderIndexs, Long[] positionIndexs, Long[] serviceIndexs, Long[] productlineIndexs, Long parentOrgId) {

        if (orderIndexs != null) {
            for (Long order : orderIndexs) {
                Role role = new Role();
                role.setId(order);
                user.getRoles().add(role);
            }
        }

        if (positionIndexs != null) {
            for (Long order : positionIndexs) {
                Position position = new Position();
                position.setId(order);
                user.getPositions().add(position);
            }
        }
        if (serviceIndexs != null) {
            for (Long order : serviceIndexs) {
                ServiceArea servicearea = new ServiceArea();
                servicearea.setId(order);
                user.getServiceAreas().add(servicearea);
            }
        }
        if (productlineIndexs != null) {
            for (Long order : productlineIndexs) {
                Productline productline = new Productline();
                productline.setId(order);
                user.getProductlines().add(productline);
            }
        }
        if (parentOrgId != null && parentOrgId.longValue() > 0) {
            Org parent = new Org(parentOrgId);
            user.setOrg(parent);
        }
        userManager.save(user);
        return "redirect:/security/user";
    }

    /**
     * 保存文件
     *
     * @param stream
     * @param filename
     * @throws IOException
     */
    private String saveFileFromInputStream(InputStream stream, String filename)
            throws IOException {
        String locationPath = FileSystemUtil.getWebRootLocalPath();
        String fullFileName = locationPath + avatarUploadPath + "/" + filename;
        FileOutputStream outputStream = new FileOutputStream(fullFileName);
        int byteCount = 0;
        byte[] bytes = new byte[1024];
        while ((byteCount = stream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, byteCount);
        }
        outputStream.close();
        stream.close();
        return avatarUploadPath + "/" + filename;
    }

    /**
     * 根据主键ID删除用户实体，并返回用户列表视图
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        userManager.delete(id);
        return "redirect:/security/user";
    }

    /**
     * 根据参数收索crm用户
     */
    @RequestMapping(value = "findEmployees")
    @ResponseBody
    public List<Employee> getEmployees(String name) {
        List<Employee> list = userManager.getEmployees(name);
        return list;
    }

}
