package runnabledemo2;
/*
 * ��runnable ʵ����Դ����thread����ʵ����Դ����
 * ps:����runnable����ʵ����Դ�������Կ����߳�ȥ����ͬһ��Դ���Ժ�;�����ʵ��runnable�ӿڵ���ʽȥ�����߳�
 */
//дһ����ʵ��runnable�ӿ�
class GongXiangDemo implements Runnable{
	private int tiket = 5;
	//��д run()����
	public void run(){
		//����ѭ������
		for (int i = 0; i <100; i++) {
			//�ж�ѭ������
			if (tiket>0) {
				
				System.out.println("��Ʊ" +"tiket="+tiket--);
			}
			
		}
	}
}

public class RunnableDemo2 {
	public static void main(String[] args) {
		//����GongXiangDemo��ʵ��������
		GongXiangDemo gx = new GongXiangDemo();
		//ת��Ϊthread ʵ��������
		//���������̣߳�����������
		new Thread(gx).start();
		new Thread(gx).start();
		new Thread(gx).start();
		
	}

}
