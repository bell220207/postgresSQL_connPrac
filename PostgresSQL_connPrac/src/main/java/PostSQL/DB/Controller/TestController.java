package PostSQL.DB.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import PostSQL.DB.command.TestVO;
import PostSQL.DB.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;

	@RequestMapping(value="/registView/new", method=RequestMethod.GET)
	public String test() {
		
		
		return "registView/new";
	}
	
    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String create(@ModelAttribute TestVO vo) {
        System.out.println(vo.toString());
        testService.regist(vo);
        
        return "redirect:registView/new";
    }
}
