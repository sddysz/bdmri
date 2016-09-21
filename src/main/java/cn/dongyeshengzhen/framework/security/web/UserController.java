package cn.dongyeshengzhen.framework.security.web;

import cn.dongyeshengzhen.framework.security.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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

    @Value("#{propertiesReader[avatar_upload_path]}")
    private String avatarUploadPath;






}
