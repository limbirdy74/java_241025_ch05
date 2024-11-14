package ch05_02;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b;
		b = a;
		
//		System.out.println(b);
		
		// 배열의 이름은 실제 배열의 값의 첫번재 원소값이 저장되어 있는 주소값이다!!. 중요
		
		int[] intArr1 = {10,20,30};
		int[] intArr2 = null;
		
		intArr2 = intArr1;
//		System.out.println(intArr2[0]);  // 10반환, 복사 완료
		
		for (int i = 0; i < intArr2.length; i++) {  // intArr2의 모든 원소 출력
			System.out.println(intArr2[i]); 
		}
		
		if (intArr1[0] == intArr2[0]) {
			System.out.println("주소 동일!!"); 
		}
	}

}
