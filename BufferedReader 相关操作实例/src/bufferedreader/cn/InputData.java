package bufferedreader.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class InputData {
	private BufferedReader  br = null;
	//ͨ�����췽��ʵ��������
	public InputData(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	//�õ��ַ�����Ϣ�ķ���
	public String getString(String info){
		String temp = null;
		System.out.println(info);
		try {
			temp = this.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	//�õ�һ����������������
	public int getInt(String info ,String err){
		int temp = 0;
		String str = null;
		boolean flag =  true;
		while (flag) {
			str = this.getString(info);
			//"^\\d+$"����//�Ǹ�������������   +   0��  
			if (str.matches("^\\d+$")) {
				temp = Integer.parseInt(str);
				flag = false;			
			}
			else {
				System.out.println(err);
			}
			
		}
		return temp;
	}	
	//�õ�һ��С������������
	public float getFloat(String info,String err){
		float temp = 0f;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			//^\d+(\.\d+)?$:�Ǹ�������
			if (str.matches("^\\d+$")){
				temp =Float.parseFloat(str);
				flag = false;		
			}
			else {
				System.out.println(err);
			}
			
			
		}
		return temp;
		
	}
	//���ڵ���������
	public Data getData(String info,String err){
		Data temp = null;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			//^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$:�򵥵������ж�
			if (str.matches("^\\d+$")){
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				try {
					temp = (Data) sd.parse(str);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag = false;		
			}
			else {
				System.out.println(err);
			}
			
		}
		return temp;
		
	}
		
}
