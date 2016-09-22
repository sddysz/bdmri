package cn.dongyeshengzhen.framework.web.builder;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import cn.dongyeshengzhen.framework.security.service.MenuManager;
import cn.dongyeshengzhen.framework.web.TagBuilder;
import cn.dongyeshengzhen.framework.web.TagDTO;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * 自定义菜单标签处理类。 根据当前认证实体获取允许访问的所有菜单，并输出特定导航菜单的html
 *
 * @author yuqs
 * @since 0.1
 */
@Component
public class FooterTagBuilder implements TagBuilder {
    // Spring的上下文
    private WebApplicationContext springContext;
    // Servlet的上下文
    private ServletContext servletContext = null;
    private TagDTO dto;


    @Override
    public String build(TagDTO dto) {
        this.dto = dto;
        this.servletContext = dto.getServletContext();
        this.springContext = dto.getSpringContext();
        MenuManager menuManager = springContext.getBean(MenuManager.class);
        StringBuffer buffer = new StringBuffer();
        List<Menu> menuList = menuManager.findAll();
        buffer.append("<div class=\"frilinkbg\">\n  <div class=\"container frilink\">");


        buffer.append(buildNav(menuList));

        buffer.append("</div>\n </div>");
        // 获取所有可允许访问的菜单列表
        // 循环迭代菜单列表，构成ID、List结构的Map
        // 根据Map构造符合左栏菜单显示的html

        return buffer.toString();
    }

    String buildContact(List<Menu> menus) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div class='header_bg'>");
        buffer.append("<div class='container header'>");
        buffer.append("<a></a>");
        buffer.append("<dl class='nav'>" +
                "<dt class='nav_a'>");

        for (int i = 0; i < menus.size(); i++) {
            Menu m = menus.get(i);
            buffer.append("<a class='");
            if (m.getContentTypeList().isEmpty()) {
                buffer.append("singleNav' ");
            } else {
                buffer.append("mainNav' ");
            }
            buffer.append("href='").append(m.getName()).append("'").append("id='nav").append(m.getId()).append("'>");
            buffer.append(m.getDisplayName()).append("</a>");


        }
        buffer.append("</dt> </dl>");
        buffer.append("<dl class=\"fri_r\">\n" +
                "\t\t\t<dt>\n" +
                "\t\t\t\t<h1>联系我们</h1>\n" +
                "\t\t\t\t<div>联系电话：0756-3377435</div>\n" +
                "\t\t\t\t<div>服务热线：400-1000-731</div>\n" +
                "             \t\t\t<div>传真号码：0756-3377436</div>\n" +
                "\t\t\t\t<div>电子邮箱：info@creawor.com</div>\n" +
                "\t\t\t\t<div>公司地址：珠海市高新区南方软件园B6栋2楼</div>\n" +
                "\t\t\t</dt>\n" +
                "\t\t\t<dd>\n" +
                "\t\t\t\t<img src=\"./创我科技_files/ewm.png\">\n" +
                "\t\t\t</dd>\n" +
                "\t\t</dl>");
        buffer.append("</div> </div>");
        return buffer.toString();
    }

    String buildNav(List<Menu> menus) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<ul class=\"fri_l\">");


        for (int i = 0; i < menus.size(); i++) {
            StringBuffer hideMenuBuffer = new StringBuffer();
            Menu m = menus.get(i);
            if (m.getDisplay_footer() == null || m.getDisplay_footer().equals(0)) {
                continue;
            }
            hideMenuBuffer.append("<li>\n<h1>" + m.getDisplayName() + "</h1>");
            for (int j = 0; j < m.getContentTypeList().size(); j++) {
                ContentType c = m.getContentTypeList().get(j);
                hideMenuBuffer.append("<div><a href=\"#\">" + c.getDisplayName() + "</a></div>");
            }
            hideMenuBuffer.append("</li>");
            buffer.append(hideMenuBuffer);
        }
        buffer.append("</ul>");

        return buffer.toString();
    }
}
