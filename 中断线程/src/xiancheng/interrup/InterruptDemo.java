package xiancheng.interrup;
/*
 * ��һ���߳�����ʱ������һ���߳̿��Խ����ж�
 * Thread void	interrupt()  �ж��̡߳�
 */
class XianChenInterrupt implements Runnable{
	public void run(){
		System.out.println("��ʼ�����ˣ�");
		try{
		Thread.sleep(10000);
		System.out.println("�߳����߽����ˣ�");
		}catch(Exception e){
		 System.out.println("�̱߳��ж��ˣ�");
		}
	}
}
public class InterruptDemo {
public static void main(String[] args) {
	XianChenInterrupt xci =new XianChenInterrupt();
	Thread t = new Thread(xci);
	t.start();
	//���߳�Ҳ������һ��
	try {Thread.sleep(500);}
	  catch(Exception e){
		  System.out.println(e);
	  }
	//mian���߳�����500����֮���ж����߳�
	t.interrupted();
			}
}
