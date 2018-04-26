package write.cn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * �ַ� ����� Writer
 * ������
 * ��Ҫ�ķ�����
 * Writer	append(char c) 
          ��ָ���ַ���ӵ��� writer��
 Writer	append(CharSequence csq) 
          ��ָ���ַ�������ӵ��� writer��
 Writer	append(CharSequence csq, int start, int end) 
          ��ָ���ַ����е���������ӵ��� writer.Appendable��
abstract  void	close() 
          �رմ�������Ҫ��ˢ������
abstract  void	flush() 
          ˢ�¸����Ļ��塣
 void	write(char[] cbuf) 
          д���ַ����顣
abstract  void	write(char[] cbuf, int off, int len) 
          д���ַ������ĳһ���֡�
 void	write(int c) 
          д�뵥���ַ���
 void	write(String str) 
          д���ַ�����
 void	write(String str, int off, int len) 
          д���ַ�����ĳһ���֡�
 * 
 */
public class WriteDemo {
public static void main(String[] args) throws Exception {
	//ʹ��File ���ҵ�һ���ļ�
	File f = new File("d:"+File.separator+"test.txt");
	//ͨ������ʵ�����������
	Writer w = new FileWriter(f);
	//����һ���ַ�
	String str = "hello world !!";
	w.write(str);
	//�ر������
	w.close();
	/*
	 * 1�����ֽ��������࣬Ψһ�ĺô��� ���ý��ַ������byte���������
	 * 2���ַ������Ҫʹ��close�� ���ܿ���д������ݣ����ֽ����ǲ��õ�
	 */
}
}
