/** TreeSet 
 * subSet()을 이용해서 범위검색 시 시작범위 포함, 끝범위 포함 X
 * 대소문자 유의
 * 오름차순 : 공백/숫자/대문자/소문자 순서
 */
package ch11;

import java.util.*;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");		set.add("alien");		set.add("bat");
		set.add("car");		set.add("Car");		set.add("disc");
		set.add("dance");		set.add("dZZZZ");		set.add("dizzzz");
		set.add("elephant");		set.add("elevator");		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}

}
