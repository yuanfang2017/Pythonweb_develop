package itcast;
/*
 * exception����ȫ���쳣
 * ע�⣺����С���쳣������ڲ������쳣��ǰ��
 * ��������ж���쳣 ����Ƿֿ����񣬶���������exception����ȫ���쳣
 */
public class YiChangAll {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {int temp =i/j;}  catch(Exception e){
			System.out.println("����ȫ���쳣"+e);
		}
		finally{
			System.out.println("������û���쳣����Ҫִ�� finally");
		}
	    System.out.println("�����쳣�ɹ���");
		
	}
	}


