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

/*-����Ǯ��

�� ó���� �� �Ҹ��� �;���.. ������ �����غ���

2��5�� ������ ���������ʴ� n�� �־����� ��, 1�θ� �̷����(1, 11, 111, 1111,.... ) n�� ��� �� ���� ���� ���� �ڸ����� ����ϴ� �����̴�. ���� ���� ���� �׽�Ʈ���̽��� �־����ٰ� �����Ƿ� �׽�Ʈ���̽��� ��� �Էµ� �� �ֵ��� �ڵ带 �����ؾ� �Ѵ�.

 

n�� 3�� ��� 111�� 1�θ� �̷���� 3�� ���� ���� ����̴�. ���� 3�ڸ��̹Ƿ� ���� 3�̴�.

n�� 7�� ��� 111111�� 1�θ� �̷���� 7�� ���� ���� ����̹Ƿ� ���� 6�̴�.

 

���� �ٽ��� 1, 11, 111, 1111, 11111 ... �� ���� �ݺ��ϸ鼭 n���� �������� ���̴�. �̶� ������ �������� �� ���� �ڸ����� ������ָ�ȴ�.
 

������ ������ ������ ��� int �� long �ڷ��� �Ѱ踦 �Ѿ�� �ð��ʰ��� �߻��Ѵ�. 

�׷��Ƿ� 1, 11, 111, 1111 ���� ���ϴ� ���ÿ� n���� �������� �� �������� ���ؾ� �Ѵ�.

 

��, a = ( a*10+1 ) % n

 

�� ���� �ڵ带 ���鼭 �����ϴ� �� ���� ���̴�.

 

 */