package comparatordemo.cn;

import java.util.Comparator;

/*
 * һ������ĳ��ڣ���û��ʵ��comparable �ӿڣ���ʱ�϶��޷����������������������Ϊ�˽��������⣬
 * Java�ֶ�������һ���Ƚ����Ĳ����ӿ�,����ǰ���ǣ������ȶ����һ���ȽϹ��������
 * �ӿڵĶ������£�
 * public interface Comparator<T>{
 * public int compare(T o1, T o2) ;
 * boolean equals(Object obj) ;
 *}
 */
//����һ��person��
 class Person{
	 private String name;
	 private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 //��дequals����
	public boolean equals(Object obj){
		if (this==obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person)obj;
		if (this.age==p.age&&this.name.equals(p.name)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	//��дtostring����
			public String toString(){
				return this.getName()+this.getAge();
			}
	
 }
 //����һ���ȽϹ���
 class PersonComparator implements Comparator<Person>{
	 public int compare(Person p1, Person p2){
		 if (p1.equals(p2)) {
			return 0;
		}
		 else if (p1.getAge()<p2.getAge()) {
			return 1;
		}
		 else {
			return -1;
		}	
	 }
 }
 
public class ComparatorDemo {
	public static void main(String[] args) {
		//����һ����������
		Person stu[] = {new Person("����",22),new Person("����",20),new Person("����",22),new Person("����",30),new Person("����",40)};
		 //����
		 java.util.Arrays.sort(stu,new PersonComparator());
		 //��������
		 for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}

}
