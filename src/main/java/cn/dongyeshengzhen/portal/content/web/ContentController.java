package cn.dongyeshengzhen.portal.content.web;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import cn.dongyeshengzhen.framework.security.service.MenuManager;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.service.ContentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Controller
public class ContentController {
    @Autowired
    private MenuManager menuManager;
    @Autowired
    private ContentManager contentManager;

    @RequestMapping(value = "/{nav}/{contentType}/{id}")
    public String content(@PathVariable String nav, @PathVariable String contentType, @PathVariable Integer id, Model model) {
        Content content = contentManager.findOne(id);
        List<Content> contentList = contentManager.findContents(content.getType());
        model.addAttribute("content", content);
        model.addAttribute("contentList", contentList);
        return "content";
    }

}
