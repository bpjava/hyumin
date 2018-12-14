/** HashMap을 생성
 * 사용자 ID와 비밀번호를 키와 값의 쌍(pair)으로 저장한 다음,
 * 입력된 사용자ID 키로 HashMap에서 검색해서 얻은 값(비밀번호)을
 * 입력된 비밀번호와 비교하는 예제
 */
package ch11;

import java.util.*;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		// 중복을 허용하지 않기 때문에 덮어쓰기된다
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);//화면으로부터 라인단위로 입력 받는다.
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다."
							+ " 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요.");
				} else { 
					System.out.println("id 와 비밀번호가 일치합니다.");
					break;
				}
			}
		}// while
	}// main의 끝
} 
