package ch05_02;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {10,20,30,40,50};
		
//		전통적인 방법
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		for (int score:scores) {  // 향상된 for 문
			System.out.println(score);
		}

	}

}
