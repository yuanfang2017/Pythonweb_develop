package tingzhixianchen.cn;
/*
 * ֹͣ�߳�
 * ��Ȼthread ������stop()������������ʹ�ã����������
 * ���ǿ���ͨ���޸ı�־λ��ֹͣ�߳�
 */
//����ʵ��runnable
class Demo implements Runnable{
	//����һ����־λ
	private boolean flag = true;
	public void run(){
		int i = 0;
		while (this.flag) {
			while (true) {
				System.out.println(Thread.currentThread().getName()+"i="+(i++));
			}	
			
		}
		
	}
	//дһ��ֹͣ�̵߳ķ���
	public void stop(){
		//�޸ı�־λ
		this.flag = false;
	}
}
public class TingZhiDemo {
	public static void main(String[] args) {
		Demo d =new Demo();
		Thread t = new Thread(d,"aaa");
		t.start();
		d.stop();
		
	}

}
