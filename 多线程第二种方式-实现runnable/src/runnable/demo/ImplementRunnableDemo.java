package runnable.demo;
/*
 * �̵߳ĵڶ���ʵ�ַ�ʽ - ʵ�� runnable �Ľӿ�\
 * ��ע�� start()��ʽ�� thread ���еģ������runnable ʵ�ֵĻ� �Ͳ����� start()��ʽ�����߳�
 * ���������thread ���ṩ�����ֹ��췽�� ,����runnable�����ʵ��������
 * 1��   �����µ� Thread ����
 * 2��Thread(Runnable target, String name)      �����µ� Thread ����
  
 */
// дһ����ȥʵ�� runnable�ӿ�
class RunnableDemo implements Runnable {
	//���췽��Ϊ���Ը�ֵ
	private String name;
	public RunnableDemo(String name){
		this.name = name;
	}
	//��дrun()����
	public void run(){
		for (int i = 0; i <10; i++) {
			System.out.println(name+"i="+i);
		}
	}
}
public class ImplementRunnableDemo {
  public static void main(String[] args) {
	// new ����ʵ�����������
	  RunnableDemo  rd = new RunnableDemo("�߳�A");
	  RunnableDemo  rd2 = new RunnableDemo("�߳�A");
	  //ͨ�� thread ���췽�� �����µ�Thread ����   Thread(Runnable target) 
	  Thread th1 =new Thread(rd);
	  Thread th2 = new Thread(rd2);
	  //��Ϊ th1��th2 ��thread���͵ģ����Կ��Ե���start()����
	  th1.start();
	  th2.start();
	 
	  
}
}
