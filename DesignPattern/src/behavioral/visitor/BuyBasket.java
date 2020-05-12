package behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class BuyBasket {
	private ArrayList<IProduct> list = new ArrayList<IProduct>();
	
	public void accept(AVisitor visitor) {
		Iterator<IProduct> i = list.iterator();
		while(i.hasNext()) {
			((IProduct)i.next()).accept(visitor);
		}
	}
	
	public void addProduct(IProduct product) {
		list.add(product);
	}
	
	public void removeProduct(IProduct product) {
		list.remove(product);
	}
}