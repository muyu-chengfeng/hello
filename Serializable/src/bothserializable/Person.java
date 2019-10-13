package bothserializable;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 1l;
	private String name = "ะกร๗" ;
	private int age = 20;
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
