package chapter11;

public class StringValueOfExample {
public static void main(String[] args) {
	String str1 = String.valueOf(10);
	String str2 = String.valueOf(10.5);
	String str3 = String.valueOf(true); // 기본 타입값 -> 문자열로 반환
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
}
}
