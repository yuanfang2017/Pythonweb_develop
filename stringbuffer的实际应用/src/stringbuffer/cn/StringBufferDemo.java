package stringbuffer.cn;
/*
 * stringbuffer��ʵ��Ӧ�ã�
 * Ƶ�����޸��ַ������ݵĵط�������ʹ��stringbuffer��������������˺ܴ�����
 * string ���ϵ��޸Ķ����������ʵ�ֵģ��������ܺܲ�
 */

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	sb.append("hello").append("world");
	for (int i = 0; i < 100; i++) {
		sb.append(i);
	}
	System.out.println(sb);
}
}
