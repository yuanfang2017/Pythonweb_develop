package itcast;
/*
 * дһ��finally ���
 */
public class FinallyDemo {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {int temp =i/j;}  catch(ArithmeticException e){
			System.out.println("erro!"+e);
		}
		finally{
			System.out.println("������û���쳣����Ҫִ�� finally");
		}
	    System.out.println("�����쳣�ɹ���");
		
	}

}
