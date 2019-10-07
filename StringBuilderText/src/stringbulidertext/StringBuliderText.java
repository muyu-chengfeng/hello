package stringbulidertext;

public class StringBuliderText {
		static String s = "abc";
		static StringBuilder s1 =new StringBuilder();
		public static void main(String[] args) {
			s1.append("abc");
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i = 0;i<100000;i++) {
			s=s+"a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		long diff = end - start;
		System.out.println("the String method uses time is: "+diff);
		long start1 = System.currentTimeMillis();
		System.out.println(start1);
		for(int i = 0;i<100000;i++) {
			
			s1=s1.append("a");
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1);
		long diff1 = end1 - start1;
		System.out.println("the StringBuilder method uses time is: "+diff1);
		}
}