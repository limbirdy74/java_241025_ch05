package ch05_02;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores = new int[2][3];  // 앞에 행, 뒤는 열. 2행 3열

		scores[0][2] = 100;
		
		int[][] scores2 = new int[2][];  // 2행 열 미지정 배열 선언
		scores2[0] = new int[3];         // 1행의 크기를 3으로 설정
		scores2[1] = new int[4];		 // 2행의 크기를 4로 설정. 다르게 설정가능
		
		scores2[1][3] = 100;  // 인덱스 [1][3] 의 위치에 100저장
		
		System.out.println(scores.length);     // 2.  행의 크기가 반환됨
		System.out.println(scores2.length);    // 2.
		System.out.println(scores[0].length);  // 3
		System.out.println(scores[1].length);  // 3
		System.out.println(scores2[0].length); // 3
		System.out.println(scores2[1].length); // 4
		
		String[] str1 = new String[3];
		
		str1[0] = "korea";
		str1[1] = "korea";
		str1[2] = new String("korea");
		
		if (str1[0] == str1[1]) {
			System.out.println("두 문자열은 동일합니다.1");  // 주소가 동일해서 같다고 나옴
		}
		if (str1[0] == str1[2]) {
			System.out.println("두 문자열은 동일합니다.2");  // 주소가 틀려서 프린트 안됨
		}
		if (str1[0].equals(str1[2])) {
			System.out.println("두 문자열은 동일합니다.3");
		}
	}
	
}
