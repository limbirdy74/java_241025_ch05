package ch05_02;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {70, 65, 80, 100, 98};  // 배열 선언과 동시에 초기화
		
//		int[] arr1;
//		arr1 = {10,20,30};  // 이렇게 하면 오류남
//		int[] arr1 = null;  // null로 초기화
//		arr1 = {10,20,30};  // 이것도 오류남 
		
		int[] arr1 = null;
		int[] arr2 = new int[5];  // 반드시 생성자에 배열의 수를 명시해 주어야 오류가 안남
		                          // 메모리 확보. int 4바이트 5개 20바이트
//		arr1 = {70, 65, 80, 100, 98}; // 이렇게도 오류남

//		System.out.println(arr1[0]);  // NullPointerException
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);  // 메모리 공간 확보시 0으로 초기화
		}
		
		arr2[0] = 50;  // 특정 인덱스 값으로 정수값을 저장. 
//		arr1[2] = 100; // NullPointerException. 이름만 있고 공간이 없다
		
		double[] doubleArray = {1.5, 2.1, 3.6, 4.2};
		
		String[] names = {"Kor", "jap", "Chn", "k"};  // 문자열들의 배열.  java 에서 한 글자는 '' 
		char[] chars = {'a', 'b', 'c'};  //  문자들의 배열
		
		String[] str1 = new String[5];
		
		System.out.println(str1[2]);  // null 이 반환
		str1[2] = "korea";
		System.out.println(str1[2]);

//		내가 해본 부분
//		int sum = 0;
//
//		for (int i = 0; i < intArray.length; i++) {
//			sum = sum + intArray[i];
//		}
//
//		System.out.println("총 합은 : " + sum);
//		System.out.println("평균은  : " + sum/intArray.length);

	}

}
