package getname;

import java.util.MissingFormatArgumentException;

/*
 * дһ��demo �����߳����ƺͻ�õ�ǰ�̵߳�����
 * thread �ķ�����
 *  String	getName() ���ظ��̵߳����ơ�
 *  static Thread	currentThread()  ���ضԵ�ǰ����ִ�е��̶߳���
             
 */
//дһ����ȥʵ�� runnable�ӿ�
class RunnableDemo implements Runnable {
	public void run(){
		//���ص�ǰ�߳�&�������
		//static Thread	currentThread()  ���ضԵ�ǰ����ִ�е��̶߳���  ����̬����ֱ��������ֱ�ӵ���
		System.out.println(Thread.currentThread().getName());
		}
	}

public class GetThreadName {
 public static void main(String[] args) {
	//RunnableDemo ��ʵ��
	 RunnableDemo rl = new RunnableDemo();
	 //2��Thread(Runnable target, String name)  �����µ� Thread ����
	 new Thread(rl,"�߳�A").start();
	 new Thread(rl,"�߳�B").start();
	 //�Զ������߳���
	 new Thread(rl).start();
	 new Thread(rl).start();
	 new Thread(rl).start();
	 
}
 
}
