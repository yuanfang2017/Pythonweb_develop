package reader.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/*
 * �ַ������� Reader  ������
 * ��Ҫ�ķ���
 * abstract  void	close() 
          �رո������ͷ���֮������������Դ��
 void	mark(int readAheadLimit) 
          ������еĵ�ǰλ�á�
 boolean	markSupported() 
          �жϴ����Ƿ�֧�� mark() ������
 int	read() 
          ��ȡ�����ַ���
 int	read(char[] cbuf) 
          ���ַ��������顣
abstract  int	read(char[] cbuf, int off, int len) 
          ���ַ����������ĳһ���֡�
 int	read(CharBuffer target) 
          ��ͼ���ַ�����ָ�����ַ���������
 boolean	ready() 
          �ж��Ƿ�׼����ȡ������
 void	reset() 
          ���ø�����
 long	skip(long n) 
          �����ַ���
 * 
 * 
 */
public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		//����file ָ��·��
		File f = new File("d:"+File.separator+"test.txt");
		//ͨ������ʵ�����������
		Reader r = new FileReader(f);
		//����һ���ַ��ռ�
		char[] ch = new char[1024];
		int len = r.read(ch);
		System.out.println(new String (ch,0,len));
		
	}

}
