package cn.dongyeshengzhen.portal.content.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongye on 2016/9/6.
 */
@Controller
public class ContentController {

    @RequestMapping(value = "/content")
    public String content(Model model){
        return "content";
    }

}
