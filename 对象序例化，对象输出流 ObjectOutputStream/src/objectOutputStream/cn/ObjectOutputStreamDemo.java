package objectOutputStream.cn;
/*
 * ��������������һ�������ɶ����Ƶ���������һ�ַ�����ͨ���������������Է����ʵ�ֶ���Ĵ���ʹ洢
 * ���һ������Ҫ���������������ڵ������ʵ�� Java.io.Serializable�ӿ�
 */
//����һ���࣬ʵ��Serializable �ӿ�

import java.io.Serializable;

class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString(){
		return "����:"+this.name+"�����䣺"+this.age;
	}
}
public class ObjectOutputStreamDemo {

}
