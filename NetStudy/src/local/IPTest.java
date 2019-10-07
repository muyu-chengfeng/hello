package local;

import java.net.*;
import java.io.*;


public class IPTest {
	
	public static void main(String[] args) throws Exception  {
//		InetAddress add = InetAddress.getLocalHost();
//		System.out.println(add.getHostAddress());
//		System.out.println(add.getHostName());
//		
//		//根据域名得到InetAddress对象
//		add =InetAddress.getByName("www.baidu.com");
//		System.out.println(add.getHostAddress());
//		System.out.println(add.getHostName());
//		
//		//根据ip得到InetAddress对象
//		add = InetAddress.getByName("14.215.177.39");
//		System.out.println(add.getHostName());
//		System.out.println(add.getHostAddress());
//		
//		InetSocketAddress address = new InetSocketAddress ("127.0.0.1",8000);
//		System.out.println(address.getHostName());
//		System.out.println(address.getAddress());
		URL url = new URL("https://www.dianping.com");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		String a = null;
		while(null!= (a = br.readLine())) {
			System.out.println(a);
		
//		URL url = new URL("http://www.baidu.com");
//		InputStream is = url.openStream();
//		//以UTF-8的形式获取内容
//		BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
//		String msg = null;
//		while(null!=(msg = br.readLine())) {
//			System.out.println(msg);
//		}
}
	}
}
