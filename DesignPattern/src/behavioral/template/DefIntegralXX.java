package behavioral.template;

//该函数是求直线y = x的积分
public class DefIntegralXX extends ADefiniteIntegral {
	private double a,b;
	private int c;
	
	public DefIntegralXX(double a,double b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	protected double geta() {
		// TODO 自动生成的方法存根
		return a;
	}

	@Override
	protected double getb() {
		// TODO 自动生成的方法存根
		return b;
	}

	@Override
	protected int getc() {
		// TODO 自动生成的方法存根
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO 自动生成的方法存根
		return x;
	}

}
