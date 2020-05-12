package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
	protected float price1,price2;
	protected String code;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AStockPrice other = (AStockPrice) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	protected List<StockHolder> stockHolderList;
	
	public AStockPrice(String code) {
		this.code =code;
		price1 = price2 = 0;
		stockHolderList = new ArrayList<StockHolder>();
	}
	
	public void add(StockHolder sh) {
		stockHolderList.add(sh);
	}
	
	public void remove(StockHolder sh) {
		stockHolderList.remove(sh);
	}
	
	public float getPrice() {
		return price1;
	}
	
	public void setPrice(float price) {
		this.price1 = price;
		notifyHolder();
	}

	protected abstract void notifyHolder();
	
	public float getPrice2() {
		return price2;
	}

	public void setPrice2(float price2) {
		this.price2 = price2;
	}
}
