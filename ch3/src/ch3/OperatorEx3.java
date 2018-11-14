/*  증감연산자 사용시 식에 두번이상 포함된 변수에 적용하는것은 피하여야한다.
 * sysout(i);
 * i++;
 * ++j;
 * sysout(j);
 */

package ch3;

public class OperatorEx3 {

	public static void main(String[] args) {
		int i=5, j=5;
		System.out.println(i++);
		System.out.println(++j);
		System.out.println("i = " + i + ", j = " + j);
	
	}

}
