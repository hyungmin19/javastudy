package ch12;

 // 논리 연산
public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		
		// && : 논리 곱 (두 항 모두 참인 경우에만 결과 값이 참)
		// || : 논리 합 (두 항 중 하나의 항만 참이면 결과 값은)
	
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = !(num1 > 0);
		System.out.println(flag);
		
		
	}

}
