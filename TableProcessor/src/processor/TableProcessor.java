package processor;

import java.io.File;
import java.util.List;

import tool.ClassFileLoader;
import tool.Scanner;
import util.TableInfo;

public class TableProcessor implements IProcessor{
	public String process(String url) throws Exception {
		List<File> classFiles = Scanner.getClassFiles(url);
		StringBuilder sql = new StringBuilder();
		for(File file : classFiles){
			Class<?> clazz = ClassFileLoader.loadClass(file);
			TableInfo table = TableInfo.parse(clazz);
			if(table != null)
				sql.append(table.toString());
		}
		return sql.toString();
	}
}
