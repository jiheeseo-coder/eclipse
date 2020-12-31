package example01;

public class OperatorEx {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("더하기 결과 : "+result);

		
		result = v1 - v2;
		System.out.println("빼기 결과 : "+result);

		result = v1 * v2;
		System.out.println("곱하기 결과 : "+result);

		result = v1 / v2;
		System.out.println("나누기 결과 : "+result);

		result = v1 % v2;	//% 나머지를 구하는 연산자
		System.out.println("나머지 결과 : "+result);
		
		// 예외처리 : 프로그램의 정상적인 종료를 위해
		try {
			result = v1 / 0;	// 산술연산예외
		}catch (Exception e) {
			System.out.println("예외 발생 "+e.toString());
		}

		
	}

}
