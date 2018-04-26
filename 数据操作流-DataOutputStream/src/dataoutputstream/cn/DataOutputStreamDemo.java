package dataoutputstream.cn;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ƽ̨�޹ص����ݲ��������ֱ�Ϊ���������dataoutputstream�������������� datainputstream ͨ������
 * ������ᰴ��һ���ĸ�ʽ�������������ͨ����������������һ���ĸ�ʽ�����ݶ��룬�����Ϳ��Է���Ķ����ݽ��д���
 * 
  ���췽����
  DataOutputStream(OutputStream out) 
          ����һ���µ������������������д��ָ�������������
 * 
 */
public class DataOutputStreamDemo {
public static void main(String[] args) throws Exception {
	//ָ��·��
	File f =new File("d:"+File.separator+"test3.txt");
	//new һ�������������
	DataOutputStream ds = null;
	try {
		 ds = new DataOutputStream(new FileOutputStream(f));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//���弸������
	String [] name = {"ë��","����","�̿�"};
	float [] price = {68.99f,34.55f,23.00f};
	int [] nums = {3,2,1};
    for (int i = 0; i < name.length; i++) {
		ds.writeChars(name[i]);
		ds.writeChar('\t');
		ds.writeFloat(price[i]);
		ds.writeChar('\t');
		ds.writeInt(nums[i]);
		ds.writeChar('\n');	
	}
    //�ر�����������
     ds.close();
	
	
}
}
