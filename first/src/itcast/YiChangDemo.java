package itcast;
/*
 * дһ�������쳣��demo  
 * try{
 *   �п��ܳ����쳣�����
 * } catch(�쳣��  �쳣����){
 *     ��д�쳣�Ĵ������
 *   }
 *   catch(�쳣��  �쳣����){
 *     ��д�쳣�Ĵ������
 *   }
 *     ....  catch�����кܶ��
 *   1�� ��� try�в����쳣����ִ��catch�е����-finally�е����-�������
 *   2�����try��û�в����쳣����ִ��finally�е����-�������
 *   ArithmeticException
 *     �����쳣
 *   
 */

public class YiChangDemo {
	public static void main(String[] args) {
		int i=10;
		int j= 0;
		try{
			int temp = i/j;} catch(ArithmeticException e){
				System.out.println("erro!"+e);
			}
		  
		System.out.println("�����쳣�ɹ���");
		
	}
}
