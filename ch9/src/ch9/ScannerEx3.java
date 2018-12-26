/** 구분자가 있는 여러 데이터 처리
 * 라인별로 읽은 다음에 ','(구분자)로하는 Scanner을 이용해 
 * 각각의 데이터를 읽는다.
 */
package ch9;

import java.util.Scanner;
import java.io.File;

class ScannerEx3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("data3.txt"));
		int cnt = 0;
		int totalSum = 0;

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;

			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = "+ sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line: " + cnt + ", Total: " + totalSum);
	}
}
