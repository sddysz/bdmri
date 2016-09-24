package cn.dongyeshengzhen.portal.admin.web;

import cn.dongyeshengzhen.portal.firstPage.service.FirstPageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dongye on 2016/9/24.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminFirstPageController {

    @Autowired
    private FirstPageManager firstPageManager;

    @RequestMapping(value = "banner")
    public String bannerList(Model model) {
        model.addAttribute("bannerList", firstPageManager.findBanners());
        return "admin/firstpage/bannerlist";
    }

    @RequestMapping(value = "banneredit")
    public String bannerEdit(Integer id, Model model) {
        return "admin/firstpage/banneredit";
    }
}
