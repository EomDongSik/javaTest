package front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ICommand {
	//인터페이스 안에서 디폴트 메소드를 써서 일반 메소드를 사용할 수 있다.
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
