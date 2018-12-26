/** data2.txt파일로부터 데이터를 읽어서 합과 평균을 구하는예제
 * 파일경로확인할것!
 */

package ch9;

import java.util.Scanner;
import java.io.File;

class ScannerEx2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("data2.txt"));
		int sum = 0;
		int cnt = 0;

		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}

		System.out.println("sum="+sum);
		System.out.println("average="+ (double)sum/cnt);
	}
}
