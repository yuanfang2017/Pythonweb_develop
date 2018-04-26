package duixiangkelong.cn;
/*
 * ����Ŀ�¡����
 * protected  Object	clone() 
          ���������ش˶����һ��������
          �����¡����Ҫ�����㣺
          1������Ҫʵ��Cloneable�ӿ�
          2���������Ҫ��дclone()
 */
//����һ���࣬����Ҫʵ��Cloneable�ӿ�
class Person implements Cloneable{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//��д clone() ���������������Ȩ�ޣ��Ա��ⲿ����
	public Object clone()throws CloneNotSupportedException
	{
		//����Ĳ����ɸ������
		return super.clone();
	}
}
public class KeLongDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//new  һ��person ʵ�����������
		Person p1 = new Person("����");
		//��¡һ�� ���� p2(��û�� new ���� Ŷ)
		Person p2 = (Person)p1.clone();
		p2.setName("����");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}

}
