import java.util.Scanner;
// 추가할 기능
// continue
// only number
class Calculate {
	// class Calculate를 생성한다.
	// -> int n1, int n2의 값을 받아와서 계산하기
	
    static int add (int n1, int n2) {
		return 0;
		//	더하기
	}
	static int min (int n1, int n2) {
		return 0;
		//	빼기
	}
	static int mul (int n1, int n2) {
		return 0;
		//	곱하기
	}
	static int div (int n1, int n2) {
		return n1/n2 ;
	}
}
public class Main{

	public static void main(String[] args) {
		// 값을 받기 위해서 Scanner를 생성
		Scanner scan = new Scanner(System.in);
		// 클래스 변수 선언
		Calculate calc = new Calculate();
		
		
		// numbers
		int num1, num2;
		// operator
		char oper;
		// continue yes or no
		String yn;
		
		System.out.println("only support +, -, *, /");
		// first number
		num1 = scan.nextInt();
		// operator
		// char 문자를 받을기 위해 .charAt()을 사용
		oper = scan.next().charAt(0);
		// second number
		num2 = scan.nextInt();
		
		// calculate part
		switch (oper) {
			// add
			case '+':
				System.out.println("Answer -> "+num1+" + "+num2+" = "+Calculate.add(num1, num2));
			break;
			
			// minus
			case '-':
				System.out.println("Answer -> "+num1+" - "+num2+" = "+Calculate.min(num1, num2));
			break;
			
			// multiple
			case '*':
				System.out.println("Answer -> "+num1+" * "+num2+" = "+Calculate.mul(num1, num2));
			break;
			
			// devide
			case '/':
				System.out.println("Answer -> "+num1+" / "+num2+" = "+Calculate.div(num1, num2));
			break;
		}
		
	}

}