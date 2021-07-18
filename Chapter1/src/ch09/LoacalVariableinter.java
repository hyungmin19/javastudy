package ch09;

public class LoacalVariableinter {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		
		str = "hello";  /* 위에서 str은 string이라고 말을 해줬ㅅ는데 hello로 바꾸는 것은 괜찮다.*/
		/*str = 3; 위에서 str은 string이라고 말을 해줬는데 int로 나오는 것은 안된다. */
	}

}
