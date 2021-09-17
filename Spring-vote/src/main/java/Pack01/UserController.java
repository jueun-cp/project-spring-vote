package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController{
	@RequestMapping("/c1")
	public String method12(Model model, UserDAO dao) {
		
		model.addAttribute("count",dao.Select());
		return "VoteResult";
	}
}