package youxianji.xianchen;

import java.util.MissingFormatArgumentException;

/*
 * �����̵߳����ȼ�
 * setPriority
public final void setPriority(int newPriority)  
������
newPriority - ҪΪ�߳��趨�����ȼ�

Java�� ���� ���ȼ�
  static int	MAX_PRIORITY 
          �߳̿��Ծ��е�������ȼ���
  static int	MIN_PRIORITY 
          �߳̿��Ծ��е�������ȼ���
  static int	NORM_PRIORITY 
          ������̵߳�Ĭ�����ȼ���
 */
//дһ����ȥʵ��runnable
class YouXianJiDemo implements Runnable{
	//��д run ����
	public void run(){
		//ѭ�� 5��
		for (int i = 0; i <5; i++) {
			try {Thread.sleep(500);}
			catch(Exception e){
				System.out.println(e);
			}
			//��ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+"����"+i);
			
		}
		
	}
}
public class YouXianJi {
	public static void main(String[] args) {
		//YouXianJiDemo yx =new YouXianJiDemo();
		//Thread t1 =new Thread(yx,"�߳�a");
		Thread t1 = new Thread(new YouXianJiDemo(),"�߳�a");
		Thread t2 = new Thread(new YouXianJiDemo(),"�߳�b");
		Thread t3 = new Thread(new YouXianJiDemo(),"�߳�c");
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}

}
