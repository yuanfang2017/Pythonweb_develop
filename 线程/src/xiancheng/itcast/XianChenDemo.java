package xiancheng.itcast;
/*
 * �̵߳ĵ�һ��ʵ�ַ�ʽ ���̳�thread �࣬����д run()������ע�⣺run()����������д
 * ��ʼ�߳� �� start()���� 
 * �ʣ������߳� ΪʲôҪ��  start()���� ��������run()����
 * �� �̵߳�������Ҫ��������ϵͳ��֧��
 */

//дһ����̳�thread ��
class MyThread extends Thread{
	//���췽��Ϊ���Ը�ֵ
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	//��д run()����
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(name+"����"+"i="+i);
		}
	}
	
}
public class XianChenDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("�߳�A");
		MyThread my2 = new MyThread("�߳�B");
		my1.start();
		my2.start();
	}

}
