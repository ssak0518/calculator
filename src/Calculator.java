import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		System.out.println("두번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		if (symbol.equals("+")) {
			System.out.println("덧셈 :" + (first + second));
		} else if (symbol.equals("-")) {
			System.out.println("뺄셈 :" + (first - second));
		} else if (symbol.equals("*")) {
			System.out.println("곱셈 :" + (first * second));
		} else if (symbol.equals("/")) {
			System.out.println("나눗셈 :" + (first / second));
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
				
	}
}
