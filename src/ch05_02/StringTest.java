package ch05_02;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Korea";
		
//		System.out.println(str[0]);  // 파이썬 처럼 하면 오류남
		
//		System.out.println(str.charAt(0));  // 이렇게 해야 한글자씩 찍을 수 있음. 한글자씩 추출 할 때 사용
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		char[] charArr = str.toCharArray();  // 문자열을 문자배열로 변환
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
	}

}
