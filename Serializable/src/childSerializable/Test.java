package childSerializable;

public class Test {
	public static void main(String[] args) throws Exception {
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
