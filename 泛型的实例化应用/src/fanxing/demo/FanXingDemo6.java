package fanxing.demo;

import java.nio.charset.MalformedInputException;
import java.util.MissingFormatArgumentException;

/*
 * ����
 * �� person - ��Ϣ���� - (1���������ͣ�2����ϵ��ʽ��3������)
 * ˼·��
 * ��һ����Ϣ�ı�ʶ�ֻ࣬Ҫ���ݵ��Ǵ˽ӿڵ�����Ϳ�������Ϊ��������
 * 
 */
//����һ����ʾ�ӿڡ�����Ϣ
interface Info{
	//�޷���
}
//����һ����ϵ��ʽ���࣬����ʵ��info �ӿ�
class Contact implements Info{
	//��������  �绰����ַ���ʱ�
	private String number;
	private String address;
	private String zipcode;
	//���췽��Ϊ���Ը�ֵ
	public Contact(String number,String address,String zipcode){
		this.number = number;
		this.address = address;
		this.zipcode = zipcode;	
	}
	// getter setter ����
	public void setnumber(String number){
		this.number = number;
	}
	public String getnumber(){
		return this.number;
	}
	public void seaddress(String address){
		this.address = address;
	}
	public String geaddress(){
		return this.address;
	}
	public void setzipcode(String zipcode){
		this.zipcode = zipcode;
	}
	public String getzipcode(){
		return this.zipcode;
	}
	//��дobject���е�toString ���������ض�����Ϣ
	public String toString(){
		return "��ϵ�绰:"+this.number+"\n"+"��ϵ��ַ:"+this.address+"\n"+"��ϵ�ʱ�:"+this.zipcode+"\n";
	}
}
//дһ���� ���˵Ļ�����Ϣ��ʵ��info �ӿ�
class Introduction implements Info{
	//�������� �� �������Ա�����
	private String name;
	private String sex;
	private String age;
	//���췽��Ϊ���Ը�ֵ
	public Introduction(String name, String sex, String age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "����:"+this.name+"\n"+"��ϵ�Ա�:"+this.sex+"\n"+"��ϵ����:"+this.age+"\n";
	
}
}
//����һ��person�࣬person����info ���Ե�����ʹ�÷���
class Person<T extends Info>{
	private T info;

	public Person(T info) {
		super();
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
		
	}
 //��д toString ����������info �����е�toString ����������
	@Override
	public String toString() {
		return this.info.toString();
	}
}
public class FanXingDemo6 {
	public static void main(String[] args) {
		//��contact������Ϊ��������
		//Contact ct = new Contact("15507546429","lixinfih","789666");
	  //Person <Contact> p  = new Person <Contact>(ct);
	  //System.out.println(ct);
		//��instrution������Ϊ��������
		Introduction id = new Introduction("wangyuanfang","Ů","24");
		Person <Introduction> p  = new Person <Introduction>(id);
		System.out.println(p);
		
	}
}


