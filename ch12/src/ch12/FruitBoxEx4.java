/** 1.5 와일드 카드 - super
 * 기호 '?' 어떠한 타입도 될 수 있음
 * <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
 * <? super T>   와일드 카드의 하한 제한. T와 그 조상들만 가능
 * <?> 			 제한없음. 모든타입이 가능 <? extends Object>와 동일
 */

package ch12;

import java.util.*;

class Fruit	{
	String name;
	int weight;
	
	Fruit(String name, int weight) {
		this.name   = name;
		this.weight = weight;
	}
	
	public String toString() { return name+"("+weight+")";}
}

class Apple extends Fruit	{
	Apple(String name, int weight) {
		super(name, weight);
	}
}

class Grape extends Fruit	{
	Grape(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp	implements Comparator<Grape> {
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {
		return t2.weight - t1.weight;
	}
}

public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		appleBox.add(new Apple("GreenApple", 300));
		appleBox.add(new Apple("GreenApple", 100));
		appleBox.add(new Apple("GreenApple", 200));

		grapeBox.add(new Grape("GreenGrape", 400));
		grapeBox.add(new Grape("GreenGrape", 300));
		grapeBox.add(new Grape("GreenGrape", 200));
	
		// 과일을 무게별로 정렬
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	} // main
}

class FruitBox<T extends Fruit> extends Box<T> {}
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList()	{ return list;	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}