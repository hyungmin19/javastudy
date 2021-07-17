package ch07;

public class DoubleTest {
	
	public static void main(String[] args) {
		
		double dnum = 3.14;  /* double이 float가 되면 에러가 뜬다.*/
		/* 실수는 기본적으로 8byte에 저장되기 때문에 double은 상관없 그런데 float는 4byte니까 F를 붙여야 한다.*/
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
	}

}
