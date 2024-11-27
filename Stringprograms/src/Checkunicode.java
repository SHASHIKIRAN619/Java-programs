package stringprogramms;
public class Checkunicode {
 void unicode(String str1)
 {
	 for(int i=0;i<=str1.length()-1;i++)
	 {
		int code=(int)str1.charAt(i);
		System.out.print(code + " ");
	 }
	 
 }
}
