package StaticProxy;

public class UserProxy implements iuser {
	private iuser user = new UserImpl();
	@Override
	public void eat(String s) {
		System.out.println("��̬����dosomething");
		user.eat(s);
		System.out.println("��̬�����dosometing");
	}
}
