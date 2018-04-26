package externalizable.cn;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * �ӿ� Externalizable  �û��Լ�ָ��������������
 * public interface Externalizable extends Serializable{
 *  public void	readExternal(ObjectInput in);
 *   public void	writeExternal(ObjectOutput out); 
 * }
 */
public class Person implements Externalizable {
	private String name;
	private int age;
	//�޲ι��죺Ҫʵ�� Externalizable �ӿڣ��������һ���޲ι���
	public Person(){}
	public Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	public String toString (){
		 return "����:"+this.name+"�����䣺"+this.age;
	}
	//ʵ���������󷽷�
	public void	readExternal(ObjectInput in) throws IOException{
	   try {
		this.name = (String)in.readObject();
		this.age = (int)in.readInt();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void	writeExternal(ObjectOutput out) throws IOException{
		out.writeObject(this.name);
		out.writeInt(this.age);
	}

}
