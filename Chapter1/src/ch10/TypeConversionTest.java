package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
//		byte bNum = 125;
//		int iNum = bNum;
		
		/*int iNum = 255;
		byte bNum = (byte)iNum;
		
		// -> 자료에 문제가 생겼다.
		
		System.out.println(bNum);
		

		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		*/
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; // 1 + 0 = 1
		int iNum2 = (int)(dNum + fNum); // 2
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum + yourNum;
		System.out.println(myNum);
		
		
		/* 증가, 감소 연산자
		 * val = ++num; 은 먼저 num값이 1증가하고 val 변수에 대입
		 * val = num++; 은 var 변수에 기존 num 값을 먼저 대입한 후 num 값 1증가
		 * */
	}

}
