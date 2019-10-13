package childSerializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTool {
		/*���������л��������ڱ����ļ���
		 * @ obj �� �����л��Ķ���
		 * @ filename �� �洢�ı����ļ���
		 */
	public static void serialize(Object obj,String filename) throws Exception{
		File file = new File(filename);   //�½�һ�������ļ������ڴ洢��������л���
		FileOutputStream output = new FileOutputStream(file);//�ļ������
		ObjectOutputStream oos = new ObjectOutputStream(output);//���������
		oos.writeObject(obj);             //������д����������
		oos.flush();                      //�ύ����������
		oos.close();                      //�ر������
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
