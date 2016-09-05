package cn.dongyeshengzhen.framework.web.builder;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import cn.dongyeshengzhen.framework.security.service.MenuManager;
import cn.dongyeshengzhen.framework.web.TagBuilder;
import cn.dongyeshengzhen.framework.web.TagDTO;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.Map;

/**
 * 自定义菜单标签处理类。 根据当前认证实体获取允许访问的所有菜单，并输出特定导航菜单的html
 *
 * @author yuqs
 * @since 0.1
 */
@Component
public class MenuTagBuilder implements TagBuilder {
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
        buffer.append("<div class='navbox'>");


        buffer.append(buildNav(menuList)).append("<div class='hide80px'></div>").append(buildNavhidebg(menuList));

        buffer.append("</div>");
        // 获取所有可允许访问的菜单列表
        // 循环迭代菜单列表，构成ID、List结构的Map
        // 根据Map构造符合左栏菜单显示的html

        System.out.println(buffer.toString());
        return buffer.toString();
    }

    String buildNav(List<Menu> menus) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div class='header_bg'>");
        buffer.append("<div class='container header'>");
        buffer.append("<a></a>");
        buffer.append("<dl class='nav'>" +
                "<dt class='nav_a'>");

        for (int i = 0; i < menus.size(); i++) {
            Menu m = menus.get(i);
            buffer.append("<a href='").append(m.getId()).append("'").append("id='nav").append(m.getId()).append("'>");
            buffer.append(m.getDisplayName()).append("</a>");


        }
        buffer.append("</dt>\n" +
                "" +
                "</dl>");
        buffer.append("</div>" +
                "</div>");
        return buffer.toString();
    }

    String buildNavhidebg(List<Menu> menus) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div class='navhidebg' style='display: none;'>\n" +
                "<div class='container navhide'>\n");


        for (int i = 0; i < menus.size(); i++) {
            StringBuffer hideMenuBuffer = new StringBuffer();
            Menu m = menus.get(i);
            hideMenuBuffer.append("<div style='display: block;'>");
            for (int j = 0; j < m.getContentTypeList().size(); j++) {
                ContentType c = m.getContentTypeList().get(j);
                hideMenuBuffer.append("<a>" + c.getDisplayName() + "</a>");
            }
            hideMenuBuffer.append("</div>");
            buffer.append(hideMenuBuffer);
        }
        buffer.append("</div>" +
                "</div>");

        return buffer.toString();
    }
}
