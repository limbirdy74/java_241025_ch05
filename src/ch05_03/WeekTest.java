package ch05_03;

public class WeekTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = Week.MONDAY;
		System.out.println(today);
		
		if (today == Week.MONDAY) {
			System.out.println("같은 주소임");
		}
		
		Season season = Season.AUTUMN;
	}

}
