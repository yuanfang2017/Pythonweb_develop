package piped.cn;

import java.io.IOException;

/*
 * �ܵ��������Խ��������߳�֮���ͨ��
 * �ܵ��������PipedOutputStream
 * �ܵ�������  �� PipedInputStream
 * Ҫʵ�ֹܵ����������뽫�������������������
 * 
 */
/*   �ܵ��������PipedOutputStream
 * ���췽����
 * PipedOutputStream() 
          ������δ���ӵ��ܵ��������Ĺܵ��������
         ��Ҫ ����:
          void	close() 
          �رմ˹ܵ���������ͷ�������йص�����ϵͳ��Դ��
 void	connect(PipedInputStream snk) 
          ���˹ܵ���������ӵ������ߡ�
 void	flush() 
          ˢ�´��������ǿ��д�����л��������ֽڡ�
 void	write(byte[] b, int off, int len) 
          �� len �ֽڴӳ�ʼƫ����Ϊ off ��ָ�� byte ����д��ùܵ��������
 void	write(int b) 
          ��ָ�� byte д�봫�͵��������
          
 * 
 */
/*   �ܵ�������  �� PipedInputStream
 * ���췽����
 * PipedInputStream() 
          ������δ���ӵ� PipedInputStream��
          ��Ҫ�ķ�����
           int	available() 
          ���ؿ��Բ��������شӴ��������ж�ȡ���ֽ�����
 void	close() 
          �رմ˹ܵ����������ͷ��������ص�����ϵͳ��Դ��
 void	connect(PipedOutputStream src) 
          ʹ�˹ܵ����������ӵ��ܵ������ src��
 int	read() 
          ��ȡ�˹ܵ��������е���һ�������ֽڡ�
 int	read(byte[] b, int off, int len) 
          ����� len �������ֽڴӴ˹ܵ����������� byte ���顣
protected  void	receive(int b) 
          ���������ֽڡ�
 * 
 */


public class PipedDemo {
	public static void main(String[] args) {
		//���� send receive ����
		Send s = new Send();
		Receive  r = new Receive ();
		//ʹ�� PipedOutputStream �е� void	connect(PipedInputStream snk) ��������
		try {
			s.getPost().connect(r.gitPis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�����߳�
		new Thread(s).start();
		new Thread(r).start();
	}

}
