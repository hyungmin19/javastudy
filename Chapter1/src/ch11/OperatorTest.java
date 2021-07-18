package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore = gameScore++; 
		
		System.out.println(lastScore); // 150
		System.out.println(gameScore); // 151
		
		// 이 차이를 이해하는 것이 중요하다. 
		

	}

}
