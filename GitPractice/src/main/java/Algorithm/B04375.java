package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B04375 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, a, len;

		String str = null;
		while ((str = br.readLine()) != null) {
			n = Integer.parseInt(str);
			a = 1;
			len = 1;

			while (true) {
				if (a % n == 0)
					break;
				len++;
				a = ((a * 10) + 1) % n;
			}
			System.out.println(len);
		}

	}

}

/*-문제풀이

맨 처음에 뭔 소린가 싶었다.. 문제를 정리해보면

2와5로 나누어 떨어지지않는 n이 주어졌을 때, 1로만 이루어진(1, 11, 111, 1111,.... ) n의 배수 중 가장 작은 값의 자리수를 출력하는 문제이다. 또한 여러 개의 테스트케이스가 주어진다고 했으므로 테스트케이스가 계속 입력될 수 있도록 코드를 구현해야 한다.

 

n이 3일 경우 111이 1로만 이루어진 3의 가장 작은 배수이다. 따라서 3자리이므로 답은 3이다.

n이 7일 경우 111111이 1로만 이루어진 7의 가장 작은 배수이므로 답은 6이다.

 

따라서 핵심은 1, 11, 111, 1111, 11111 ... 의 수를 반복하면서 n으로 나눠보는 것이다. 이때 나누어 떨어지면 그 수의 자리수를 출력해주면된다.
 

하지만 무작정 구현할 경우 int 및 long 자료형 한계를 넘어가서 시간초과가 발생한다. 

그러므로 1, 11, 111, 1111 수를 구하는 동시에 n으로 나누었을 때 나머지를 구해야 한다.

 

즉, a = ( a*10+1 ) % n

 

위 말은 코드를 보면서 이해하는 게 빠를 것이다.

 

 */