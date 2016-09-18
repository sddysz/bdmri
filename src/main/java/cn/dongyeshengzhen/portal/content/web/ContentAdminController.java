package cn.dongyeshengzhen.portal.content.web;

import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.service.ContentManager;
import cn.dongyeshengzhen.portal.content.service.ContentTypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongye on 2016/9/17.
 */
@Controller
@RequestMapping(value = "admin/content")
public class ContentAdminController {
    @Autowired
    private ContentManager contentManager;
    @Autowired
    private ContentTypeManager contentTypeManager;


    @RequestMapping(value = "list")
    public String edit(Model model) {

        model.addAttribute("contentList", contentManager.findAll());


        return "admin/content/list";
    }


    @RequestMapping(value = "edit")
    public String edit(Model model, Integer id) {

        model.addAttribute("typeList", contentTypeManager.findAll());

        if (id != null) {
            Content content = contentManager.findOne(id);
            model.addAttribute("content", content);
        }

        return "admin/content/edit";
    }

    @RequestMapping(value = "save")
    public String save(Model model, Content content) {
        contentManager.save(content);
        return "redirect:/admin/content/list";

    }
}
