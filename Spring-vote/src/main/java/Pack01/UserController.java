package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController{
	@RequestMapping("/a1")
	public String method12(UserData data, UserDAO dao) {
		dao.update(data.getName(), data.getPin(), data.getCand());
		System.out.println(data.getName());
		System.out.println(data.getPin());
		System.out.println(data.getCand());
		
		return data.getCand()==null?"NullVote":"OverlapUser";
	}
}