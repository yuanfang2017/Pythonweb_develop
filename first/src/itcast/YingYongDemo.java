package itcast;
/*
 * public static int parseInt(String s) throws NumberFormatException
     �����ڵ��ô���û��try catch
     ���ۣ�
     exception ������Ҫ�� try catch ����
     RunTimeException :���Բ�ʹ�� try catch����������쳣���ͽ������������ 
 */
public class YingYongDemo {
	public static void main(String[] args) {
		//����һ���ַ���
		String str = "1234";
		//�� �ַ���ת��Ϊ�������ð�װ������ķ���
	     int temp = Integer.parseInt(str);
	      System.out.println(temp);
	}
	
}
