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
	}

}
