package file.cn;

import java.io.File;
import java.io.IOException;

/*
 * file �����ļ�������
 * ���췽����
 * File(String pathname) 
          ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ����
          �Ƚϳ��õķ�����
      boolean	createNewFile() 
          ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ���
 */
public class FileDemo {
  public static void main(String[] args) throws IOException {
	//������d�̽���һ���ļ���
	  //����file ����
	  File f = new File("d://test.txt");
	  //����һ���ļ�
	  f.createNewFile();
	  //��ӡ����ϵͳ�ķָ���
	  System.out.println("��ʾ·���ķָ�����"+File.pathSeparator);
	  System.out.println("��ʾ·���ķָ�����"+File.separator);
	  
}

}
