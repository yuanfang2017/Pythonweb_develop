package bufferedreader.cn;

public class Menu {
	public Menu(){
		while (true) {
			this.show();
		}
	}
	public void show(){
		System.out.println("===XXXϵͳ===");
		System.out.println("��1������������");
		System.out.println("��2����ɾ������");
		System.out.println("��4�����鿴����");
		System.out.println("��0����ϵͳ�˳�");
		InputData ip = new InputData();
		int i = (int)ip.getInt("��ѡ����ȷ��ѡ��:", "����ˣ�");
		switch (i) {
		case 1:{
			Operate.add();
			break;
			}
		case 2:{
			Operate.delete();
			break;
			}
		case 3:{
			Operate.update();
			break;
			}
		case 4:{
			Operate.find();
			break;
			}
		case 0:{
			System.exit(1);
			break;
		}
		default:{
			System.out.println("��ѡ����ȷ�Ĳ�����");
		}
			
		}
		
	}

}
