package index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.addObject("name","administrator");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
