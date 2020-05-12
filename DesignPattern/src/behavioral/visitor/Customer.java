package behavioral.visitor;

public class Customer extends AVisitor {

	@Override
	public void visit(Apple apple) {
		// TODO 自动生成的方法存根
		System.out.println("顾客"+name+"选苹果");
	}

	@Override
	public void visit(Book book) {
		// TODO 自动生成的方法存根
		System.out.println("顾客"+name+"选书");
	}

}
