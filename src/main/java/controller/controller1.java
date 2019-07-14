package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.service.service1;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Xx;

import java.util.List;

/**
 * @author xxx
 * @date 2019/7/10 23:10
 * @description
 */
@Controller
public class controller1 {
    @Autowired
    private service1 s1;
    @RequestMapping("/findXxall")
    public  String findXxall(Model model){
        List<Xx> x=s1.findxx();
        model.addAttribute("x",x);
        return "page1";
    }
}
