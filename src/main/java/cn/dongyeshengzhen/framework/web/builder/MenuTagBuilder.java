package cn.dongyeshengzhen.framework.web.builder;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import cn.dongyeshengzhen.framework.security.service.MenuManager;
import cn.dongyeshengzhen.framework.web.TagBuilder;
import cn.dongyeshengzhen.framework.web.TagDTO;
import org.apache.commons.lang.StringUtils;
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
        MenuManager menuManager=springContext.getBean(MenuManager.class);
        StringBuffer buffer = new StringBuffer();
        // 获取所有可允许访问的菜单列表
        // 循环迭代菜单列表，构成ID、List结构的Map
        // 根据Map构造符合左栏菜单显示的html
        buffer.append("<ul class=\"sidebar-menu\"><li class=\"header\">导航栏</li>");
        buffer.append("</ul>");
        return buffer.toString();
    }

}
