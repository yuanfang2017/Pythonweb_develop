package itcast;
/*
 * �쳣��ļ̳й���
 * ��Java���쳣�ṹ�У������ֳ��õ��࣬�ֱ�Ϊexception �� error  ����������ȫ������thowable ������
 * exception��������쳣��������try catch ����
 * error��  һ����jvm ������� ����
 */
public class YiChangClass {
 public static void main(String[] args) {
	 int i = 10;
		int j = 0;
		try {int temp =i/j;}  catch(ArithmeticException e){
			e.printStackTrace();  //printStackTrace() ��exception�ķ�����������쳣��Ϣ���������Ժ�ᾭ���õ�
		}
		finally{
			System.out.println("������û���쳣����Ҫִ�� finally");
		}
	    System.out.println("�����쳣�ɹ���");
		
	}
}

