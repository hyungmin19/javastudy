package ch13;
// 조건 연산 & scanner 사용법 
import java.util.Scanner;

// scanner 라이브러리를 불러오기 위해 import를 사용한다.

// 조건 연산자

// 조건식 ? 결과1 : 결과2;
// 조건식이 참이면 결과1, 조건식이 거짓이면 결과 2가 선택된다.
// 연산 예 : int num = (5>3) ? 10 : 20;

public class ConditionTest {

	public static void main(String[] args) {
		
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를출력하세요");
		
// 입출력 받을 때는 원래 I O stream을 쓴다.
		// 간단한 입력을 받을 때는 scanner을 쓴다.
		
		Scanner scanner = new Scanner(System.in);
		//여기서 System.in 은 표준 입력을 말한다. 콘솔화면에서 입력을 받도록 해주는 것!
		System.out.println("입력 1 : ");
		int num1 = scanner.nextInt();
		System.out.println("입력 2 : ");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}

}
