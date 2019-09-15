package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	private Object object;
	public DynamicProxy(Object object) {
		this.object = object;
	}
	@Override
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		System.out.println("��̬����ǰdosomething");
		method.invoke(this.object,args);
		System.out.println("��̬������dosomething");
		return null;
	}
}