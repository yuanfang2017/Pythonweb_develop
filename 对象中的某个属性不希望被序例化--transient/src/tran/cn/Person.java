package tran.cn;

import java.io.Serializable;

/*
 * һ�������е����Բ�ϣ����������������transient ����
 */
public class Person implements Serializable{
	//name ��ϣ����������
	transient private String name;
	private int age;
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString(){
		return "����:"+this.name+"�����䣺"+this.age;
	}
}
