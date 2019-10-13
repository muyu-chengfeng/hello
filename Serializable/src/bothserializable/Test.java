package bothserializable;

public class Test {
	public static void main(String[] args) throws Exception {
	//父类序列化
	Person p1 = new Person();
	SerializableTool.serialize(p1,"Person");
	SerializableTool.printFileInfo("Person");
	Object obj1 = SerializableTool.deSerialize("Person");
	Person dep1 = (Person) obj1;
	System.out.println("Person name:"+ dep1.getName());
	System.out.println("Person age:"+ dep1.getAge());
	//子类序列化
	Students p = new Students();
	SerializableTool.serialize(p,"Students");
	SerializableTool.printFileInfo("Students");
	Object obj = SerializableTool.deSerialize("Students");
	Students dep = (Students) obj;
	System.out.println("Students name:"+ dep.getName());
	System.out.println("Students age:"+ dep.getAge());
	System.out.println("Students professional:"+dep.getProfessional());
	}
}
