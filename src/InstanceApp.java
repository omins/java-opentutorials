import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {

		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();

		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();

		// 하나의 클래스를 new로 복제해서 p1과 p2와 같은 인스턴스를 만들고, 각 인스턴스는 다른 내부적인 상황을 갖을 수 있다.
		// Constructor 가 있으면 인스턴스를 만드는 것이 혀용되어 있다.
	}

}
