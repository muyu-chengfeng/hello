package childSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTool {
		/*将对象序列化，并存在本地文件中
		 * @ obj ： 被序列化的对象
		 * @ filename ： 存储的本地文件名
		 */
	public static void serialize(Object obj,String filename) throws Exception{
		File file = new File(filename);   //新建一个本地文件，用于存储对象的序列化；
		FileOutputStream output = new FileOutputStream(file);//文件输出流
		ObjectOutputStream oos = new ObjectOutputStream(output);//对象输出流
		oos.writeObject(obj);             //讲对象写入对象输出流
		oos.flush();                      //提交对象输入流
		oos.close();                      //关闭输出流
		output.close();
	}
	public static Object deSerialize(String filename) throws Exception{
		File file = new File(filename);
		FileInputStream input = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(input);
		Object obj = ois.readObject();
		ois.close();
		input.close();
		return obj;
	}
	public static void printFileInfo(String filename) {
		File file = new File(filename);
		System.out.println("-----------------------");
		System.out.println("<FileName>:"+filename);
		System.out.println("<FileSize>"+file.length()+" bytes");
		System.out.println("-----------------------");
	}

}
