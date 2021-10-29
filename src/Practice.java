
public class Practice {
	public static void main(String[] args) {		
		System.out.println("\n--Numbers and Math--");
		System.out.println(Math.PI);
		System.out.println(Math.floor(Math.PI));		
		System.out.println(Math.ceil(Math.PI));
		
		
		
		System.out.println("\n--String and Char--");
		System.out.println("Hello World"); //String
		System.out.println('S'); //Character 작은 따옴표는 의미가 달라진다 
		System.out.println("S"); // String
		System.out.println("Hello "
				+ "World");
		System.out.println("Hello \nWorld"); //println에서도 \n이 적용됨 
		System.out.println("Hello \"World\""); // '\'를 앞에 붙여줌으로써 Escape 함
		
		
		
		System.out.println("\n--Variables--");
		//Variables
		//데이터 타입을 정해주는 이유: 그 안에 있는 값은 반드시 문자, 숫자 등이다. (의심을 안 해도 됨)
		
		int a = 49;
		double b = 1.1;
		String c = "Hello Minseok";
		
		
		System.out.println(a); 
		System.out.println(b);  
		System.out.println(c);  
		
		
		
		System.out.println("--Using Var--"); //변수의 값이 바뀜으로써 수억개의 변수의 값을 한 번에 바꿀 수 있음 (값에 이름을 부여하는 것) 
		String name = "Minseok";
		System.out.println("Hello "+name+" ... "+name+" ... "+name+ " ... bye.");
		
		
		
		
		
		
	}
		
	
}
