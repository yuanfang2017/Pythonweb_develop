package itcast;
/*
 * �Զ����쳣
 * throw :����ֱ��ʹ��throw ��Ϊ���׳�һ���쳣���׳�ʱֱ���׳��쳣���ʵ�������� ���ɣ�һ�㲻���鵥��ʹ��throw
 * throws ��������������ʹ�ã�һ��̸������õĵط������쳣
 */
//�Զ���һ���쳣��̳� exception
class myexception extends Exception{
	//���췽�������쳣��Ϣ
	public myexception(String msg){
		super(msg);
	}
}
public class DefaultDemo {
public static void main(String[] args) {
	try{
		throw new myexception("�Զ����쳣");
	} catch(Exception e){
	  System.out.println(e);
	}
}
}


//    �ǵ�д����� 