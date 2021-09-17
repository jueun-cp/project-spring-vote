package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/b1")
	public String method01(UserData data, Model model, UserDAO dao) {
		dao.select(data.getName(), data.getPin());
//		System.out.println(data.getName());
//		System.out.println(data.getPin());		

		model.addAttribute("data", data);

		int num = dao.select(data.getName(), data.getPin());

		switch (num) {
		case 1: {
			return "Vote";
		}
		case 2: {
			return "OverlapUser";
		}
		case 3: {
			return "FailAuth";
			}
		default :
			return "index";
		}

	@RequestMapping("/c1")
	public String methodc1(Model model, UserDAO dao) {
		
		model.addAttribute("count",dao.Select());
		return "VoteResult";
	}
  
	@RequestMapping("/a1")
	public String methoda1(UserData data, UserDAO dao) {
		dao.update(data.getName(), data.getPin(), data.getCand());
		System.out.println(data.getName());
		System.out.println(data.getPin());
		System.out.println(data.getCand());
		
		return data.getCand()==null?"NullVote":"OverlapUser";
	}
}
