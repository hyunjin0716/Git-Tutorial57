@Controller
public class UserController{
	
	//로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("경로 : login");
		
		return "user/login";
	}
	
	//추가 페이지로 이동
	@RequestMapping("/user/insert.do")
	public String insert() {
		logger.info("경로 : insert");
			
		return "user/insert";
	}
	
	//수정 페이지로 이동
	@RequestMapping("/user/update.do")
	public String update() {
		logger.info("경로 : update");
			
		return "user/update";
		}

	//회원 수정 페이지로 이동
	@RequestMapping("/user/select.do")
	public String select() {
		logger.info("경로 : select");
				
		return "user/select";
		}
	}

	//삭제 페이지로 이동
	@RequestMapping("/user/delete.do")
	public String delete() {
		logger.info("경로 : delete");
			
		return "user/update";
	}
	//작업공간에서  commit후 이동
}