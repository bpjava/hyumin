package com.app.applicationContast.core;
// ���� ���Ͻ� ��� ���ڷ��̼�~~~~~~ ��ü�������̾�~~~~~~

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//���÷���
public class ClassDefinition {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

	
		targetAble t = new Target();
		System.out.println(t.getCharge());
		targetAble txAble = new Tax(t);
		System.out.println(tx.getChange());
	}
}
// ���

interface v220{
	public void on220();
	
}
class v110{
	public void on110() {
		System.out.println("110 on");
	}
}




















//���ڷ���Ʈ

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






















//�ٽôٽ�



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

//�������

class Target {
	public void show(String name) {
		System.out.println("name is " + name);

	}
}
// ��� ���ϱ�
// �ܺ� ���� ���ϱ�

class Proxy extends Target {
	public static void show(String name) {
		System.out.println("log start");
		super.show(name);
		System.out.println();

	}

}