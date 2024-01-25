// StringTokenizer을 이용해서 문자열로부터 토큰을 분리하는 프로그램
package ex11_3_StringTokenizer;

import java.util.StringTokenizer;

class StringTokenizerExample1_4 {
	public static void main(String args[]) {
		StringTokenizer stok = new StringTokenizer("사과,배,복숭아",",");
													// 구분자 투입 //구분자
		while(stok.hasMoreTokens()) { // 토큰이 있는 동안 반복하는 메서드
			System.out.println(stok.nextToken());
		}
	}
}