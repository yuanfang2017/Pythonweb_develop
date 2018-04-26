package jvm.cn;
/*
 * runtime�����ȡ��һЩϵͳ����Ϣ
 * static Runtime	getRuntime() 
          �����뵱ǰ Java Ӧ�ó�����ص�����ʱ����
          long	maxMemory() 
          ���� Java �������ͼʹ�õ�����ڴ�����
           long	freeMemory() 
          ���� Java ������еĿ����ڴ�����
 */
public class RunTimeDemo {
	public static void main(String[] args) {
		//��̬����Ϊ�����ʵ����
		Runtime rt = Runtime.getRuntime();
		//�õ�jvm������ڴ���
		System.out.println("jvm������ڴ���"+rt.maxMemory());
		//�õ�jvm�Ŀ����ڴ���
		System.out.println("jvm�Ŀ����ڴ���"+rt.freeMemory());
		//���һ��������Ƶ�������������ڴ�
		String str = "hello"+"world";
	    for (int i = 0; i < 100000; i++) {
			str= str+i;
		}
	    System.out.println("ִ��string����ڴ������"+rt.freeMemory());
	    //�ͷ������ڴ�
	    rt.gc();  
	    System.out.println("�ͷ���������ڴ������"+rt.freeMemory());
	}

}
