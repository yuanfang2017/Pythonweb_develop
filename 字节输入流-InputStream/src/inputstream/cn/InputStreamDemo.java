package inputstream.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * �� InputStream
 * �ֽ�������  ��������
 * ��Ҫ�ķ�����
 *  int	available() 
          ���ش���������һ���������ÿ��Բ��������شӴ���������ȡ�����������Ĺ����ֽ�����
 void	close() 
          �رմ����������ͷ����������������ϵͳ��Դ��
 void	mark(int readlimit) 
          �ڴ��������б�ǵ�ǰ��λ�á�
 boolean	markSupported() 
          ���Դ��������Ƿ�֧�� mark �� reset ������
abstract  int	read() 
          ���������ж�ȡ���ݵ���һ���ֽڡ�
 int	read(byte[] b) 
          ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�
 int	read(byte[] b, int off, int len) 
          ������������� len �������ֽڶ��� byte ���顣
 void	reset() 
          ���������¶�λ�����һ�ζԴ����������� mark ����ʱ��λ�á�
 long	skip(long n) 
          �����Ͷ����������������ݵ� n ���ֽڡ�
 */
public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		//ʹ��file �ҵ�һ���ļ�
		File f = new File("d:"+File.separator+"test.txt");
		//ͨ������ʵ��������
		InputStream is =new FileInputStream(f);
		//����һ��1024���ֽ����飬�����е����ݶ�����������
		byte[] b = new byte[1024];
		//��ȡ����
		is.read(b);
		//�ر�������
		is.close();
		//��ӡ��������,��byte����ת��Ϊstring�������
		System.out.println(new String(b));
		
	}

}
