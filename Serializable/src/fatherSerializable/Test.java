package fatherSerializable;

public class Test {
	public static void main(String[] args) throws Exception {
		//∏∏¿‡–Ú¡–ªØ
		Person p1 = new Person();
		SerializableTool.serialize(p1,"Person");
		SerializableTool.printFileInfo("Person");
		Object obj1 = SerializableTool.deSerialize("Person");
		Person dep1 = (Person) obj1;
		System.out.println("Person name:"+ dep1.getName());
		System.out.println("Person age:"+ dep1.getAge());
	}
}
