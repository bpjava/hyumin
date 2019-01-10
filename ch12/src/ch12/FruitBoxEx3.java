/** 1.5 와일드 카드 - extends
 * 기호 '?' 어떠한 타입도 될 수 있음
 * <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
 * <? super T>   와일드 카드의 하한 제한. T와 그 조상들만 가능
 * <?> 			 제한없음. 모든타입이 가능 <? extends Object>와 동일
 */
package ch12;

import java.util.ArrayList;

class Fruit				  { public String toString() {return "Fruit";} }
class Apple extends Fruit { public String toString() {return "Apple";} }
class Grape extends Fruit { public String toString() {return "Grape";} }

class Juice {
	String name;
	
	Juice(String name)		 { this.name = name + "Juice"; }
	public String toString() { return name; 			   }
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();

		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	} // main의 끝
}

class FruitBox<T extends Fruit> extends Box<T> { }

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);		}
	T get(int i)	 { return list.get(i);  }
	ArrayList<T> getList()  { return list;  }
	int size()		 { return list.size();  }
	public String toString() { return list.toString();}
}
