package ex11_1_String;

public class StringExample7 {
	public static void main(String args[]) {
		String str1 = "   I Like Java";
		String str2 = str1.trim();
		System.out.println("=== trim() : 문자열 앞뒤 공백제거 ===");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("문자열 길이 = " + str2.length() + "\n");
		
		System.out.println("=== concat() : 문자열 연결 ===");
		System.out.println(str2.concat(" 날씨가 좋아요"));
		System.out.println(str2 + "\n");
		
		System.out.println("=== toUppercase() : 대문자로 변환 ===");
		System.out.println(str2.toUpperCase());
		System.out.println(str2 + "\n");
		
		System.out.println("=== toLowercase() : 소문자로 변환 ===");
		System.out.println(str2.toLowerCase());
		System.out.println(str2 + "\n");
		
		// 값을 임시적으로 보여줄뿐이지 내면이 바뀐것은 아님
				
		// 참조 변수는 메소드를 호출
		
		System.out.println("=== replace() : 새로운 글자로 모두 변경 ===");
		System.out.println(str2.replace('a', 'A'));
		System.out.println(str2 + "\n");
		
		System.out.println("==================toString()==================");
		System.out.println(str1.toString());
		System.out.println(str2.toString() + "\n");
	}

}
