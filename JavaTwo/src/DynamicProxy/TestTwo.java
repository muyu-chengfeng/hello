package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestTwo {
	public static void main(String args[]) {
		iuser user = new UserImpl();
		InvocationHandler dyProxy =new DynamicProxy(user);
		iuser proxy =(iuser) Proxy.newProxyInstance(iuser.class.getClassLoader(),new Class[] { iuser.class}, dyProxy);
		proxy.eat("ÃæÌõ");
	}
}
