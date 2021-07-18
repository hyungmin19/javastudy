package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		
		
		// 상수 선언은 final 예약어를 사용하여 선언한다. 상수는 변하지 는 수! 초기화를 하는게 좋다. 초기화를 하면 바꿀 수 없다.
		// 대문자로 상수를 많이 표현한다. 
		final int MAX_NUM = 100;
		final int MIN_NUM; // 상수 선언 했지만 얼마인지 assign을 해야한다. 그래서 밑에 MIN_NUM = 0; 이라고 한 것.
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM = 1000;

	}

}

// literal(리터럴) : 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함.
// 리터럴은 상수 풀(constant pool)에 있음.
// 정수 리터럴은 int로 , 실수 리터럴은 double로 저장된다.


/*  하드디스크에 프로그램이 있고 하드디스크 프로그램을 실행시키면 그 프로그램이 메모리로 load가 된다. 
 * load되는 시점에 프로그램의 자료중에 일부는 메모리를 잡는다. 
 * 실행이 되면서 메모리를 잡는 애들이 있고 프로그램 실행과 상관없이 메모리를 잡는 애들이 있다.(프로그램이 로드 되는 순간)
 * 프그램이 로드되는 순간 메모리를 잡는 애들이 주로 상수 static 변수 이런 애들이다.
 * 이런애들이 자리 잡는 영역을 Data 영역 또는 constant pool 이라고 한다.
 * 이런 애들은 프로그램 실행이 끝나고 unload될 때 사라지게 된다.
 * */


/* 형변환 
 * 묵시적형변환 : 자동으로 변경되는 형변환 / 명시적 형변환 : 프로그래머가 강제로 형 변환하는 것.
 * 작은 메모리에서 큰메모리로 옮겨가는 것은 그대로 바뀌는데
 * 큰 메모리에서 작은 메모리로 갈 때는 변경을 해주어야 한다.
 * byte bNum = 10;
 * int iNum - bNum;
 * 
 * int iNum1 = 20;
 * float fNum = iNum2;
 * 
 *  int iNum = 10;
 *  byte bNum = (byte)iNum;  (byte)이게 명시적 형변환이다! 나는 byte로 바꾸겠다. 이런 
 *  
 *  double dNum = 3.14;
 *  int iNum2 = (int)dNum;
 *  
 * */
