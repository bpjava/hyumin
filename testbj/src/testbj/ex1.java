package testbj;

import java.util.*;

public class ex1 {
	public static void main(String[] args) {
           HashSet<String> hashSet = new HashSet<String>();
           HashSet<String> hashSet2 = new HashSet<String>();
           HashSet<String> result = new HashSet<String>();

           
           hashSet.add("자바1");        hashSet.add("카푸치노");
           hashSet.add("에스프레소");    hashSet.add("자바2");
           System.out.println("저장된 데이타 수 : " + hashSet.size());

           hashSet2.add("자바1");  hashSet2.add("자바2");
           System.out.println("찾을 값 : " + hashSet2.size());
           
           // 교집합 이용
           Iterator it = hashSet2.iterator();
           while(it.hasNext()) {
        	   Object tmp = it.next();
        	   if(hashSet.contains(tmp))
        		   result.add((String) tmp);
           }
           
           System.out.println("자바포함하는 값 : " + result);
           /*Iterator<String> iterator = hashSet.iterator();

           while(iterator.hasNext()){
        	   String str = iterator.next();
        	   System.out.println(str);
       	   }
    */
}
    
}
    