package com.app.applicationContast.core;
// 패턴 프록시 어뎁터 데코레이션~~~~~~ 데체무슨말이야~~~~~~

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//리플랙션
public class ClassDefinition {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

	
		targetAble t = new Target();
		System.out.println(t.getCharge());
		targetAble txAble = new Tax(t);
		System.out.println(tx.getChange());
	}
}
// 어뎁터

interface v220{
	public void on220();
	
}
class v110{
	public void on110() {
		System.out.println("110 on");
	}
}




















//데코레이트

class Target{
	public int getCharge() {
		return 1000;
	}
}
interface targetAble{
	public int getCharge();
}
class TAX(targetAble target){
	super();
	this.target = target;
}






















//다시다시



class Sword{
	AttackAble att;
	
	
	public Sword(AttackAble att) {
		super();
		this.att = att;
	}
}
interface AttackAble{
	public void attac();
		
}

class Attack{
	
}

class HavyAttack{
	
}

//여기까지

class Target {
	public void show(String name) {
		System.out.println("name is " + name);

	}
}
// 상속 통하기
// 외부 유입 통하기

class Proxy extends Target {
	public static void show(String name) {
		System.out.println("log start");
		super.show(name);
		System.out.println();

	}

}