package behavioral.chain;

public class MidFruitSorting extends AbstractFruitSort {

	public MidFruitSorting(int weight) {
		super(weight);
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO 自动生成的方法存根
		fruitBox.add("水果罐头："+fruit);
	}

}
