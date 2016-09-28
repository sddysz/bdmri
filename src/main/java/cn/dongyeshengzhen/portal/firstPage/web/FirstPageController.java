package cn.dongyeshengzhen.portal.firstPage.web;

import cn.dongyeshengzhen.portal.firstPage.entity.FirstPageType;
import cn.dongyeshengzhen.portal.firstPage.service.FirstPageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by dongye on 2016/9/3.
 */
@Controller
public class FirstPageController {

    @Autowired
    FirstPageManager firstPageManager;

    /**
     * 登录成功后系统首页
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("banners", firstPageManager.findByType(FirstPageType.BANNER));
        List news=firstPageManager.findByType(FirstPageType.NEWS);
        model.addAttribute("newsUp",news.subList(0,3));
        model.addAttribute("newsDown",news.subList(3,6));
        return "index";
    }
}
