package xianchen.houtai;

/*
 * ��̨�̣߳������������
 * setDaemon
public final void setDaemon(boolean on)
 */
//Ҫ������Ϊ��̨�̣߳����԰�run()��������Ϊ ��ѭ��
//����һ���࣬ʵ��runnable
class HouTaiXianChenDemo implements Runnable{
	//��д run����
	public void run(){
		//дһ����ѭ��
		while (true) {
			System.out.println(Thread.currentThread().getName()+"������");
			
		}
	}
}
public class HouTaiXianChen{
public static void main(String[] args) {
	HouTaiXianChenDemo ht = new HouTaiXianChenDemo();
	Thread t = new Thread(ht);
	//�����߳��ں�̨����
	t.setDaemon(true);
	//�����߳�
    t.start();	
}

}
