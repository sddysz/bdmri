package cn.dongyeshengzhen.portal.firstPage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dongye on 2016/9/3.
 */
@Controller
public class FirstPageController {

    /**
     * 登录成功后系统首页
     * @return
     */
    @RequestMapping(value = "/index" ,method= RequestMethod.GET)
    public String index() {
        return "index";
    }
}
