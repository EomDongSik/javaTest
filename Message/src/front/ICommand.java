package front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ICommand {
	//�������̽� �ȿ��� ����Ʈ �޼ҵ带 �Ἥ �Ϲ� �޼ҵ带 ����� �� �ִ�.
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
