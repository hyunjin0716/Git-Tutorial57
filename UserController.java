@Controller
public class UserController{
	
	//로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("경로 : login");
		
		return "user/login";
	}
	
	//가입 페이지로 이동
	@RequestMapping("/user/insert.do")
	public String insert() {
		logger.info("경로 : insert");
			
		return "user/insert";
	}
	
	//가입 페이지로 이동
	@RequestMapping("/user/update.do")
	public String update() {
		logger.info("경로 : update");
				
		return "user/update";
		}

	//회원 수정 페이지로 이동 - master branch에서 작업했다!
	@RequestMapping("/user/select.do")
	public String select() {
		logger.info("경로 : select");
				
		return "user/select";
		}
}