package randomaccessfile.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*�� RandomAccessFile
 * File �Ƕ��ļ��Ĳ������� RandomAccessFile�Ƕ��ļ����ݵĲ���
 * �����ʵ��֧�ֶ���������ļ��Ķ�ȡ��д��
 * ���õĹ��췽����
 * RandomAccessFile(File file, String mode) 
          �������ж�ȡ��������д�루��ѡ������������ļ��������ļ��� File ����ָ����
          ���õķ�����
           void	close() 
          �رմ���������ļ������ͷ����������������ϵͳ��Դ��
           void	writeBytes(String s) 
          ���ֽ����н����ַ���д����ļ���
           void	writeInt(int v) 
          ���ĸ��ֽڽ� int д����ļ�����д���ֽڡ�

 * 
 */
public class RandomAccessFileDemo {
  public static void main(String[] args) throws IOException {
	  //�����ļ�����
	  File f = new File("d:"+File.separator+"test.txt");
	//�����ļ����������󣬲�����Ϊ�ɶ�д
	  RandomAccessFile ra = new RandomAccessFile(f,"rw");
	  //���ļ���д�뼸������
	  ra.writeBytes("zhangsan");
	  ra.writeInt(20);
	  ra.writeBytes("lisi");
	  ra.writeInt(30);
	  ra.writeBytes("wangwu");
	  ra.writeInt(40);
	  //�ر���
	    ra.close();
	    
	  
	  
}

}
