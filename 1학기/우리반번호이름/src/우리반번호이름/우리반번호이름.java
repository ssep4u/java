package �츮�ݹ�ȣ�̸�;

import java.util.Scanner;

//import java.util.Scanner;

public class �츮�ݹ�ȣ�̸� {
	public static void main(String[] args) {
		// 2-3
		// "������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", "������",
		// "��ä��", "�̼���", "��ä��", "������", "������", "�����", "������", "�Ѵٿ�"
		// 2-4
		String[] ��4 = { "������", "������", "�����", "�躽��", "�����", "��ä��", "������", "�ڼ���", "������", "��ä��", "�����", "���ϴ�", "��ä��",
				"������", "������", "������", "������", "������" };
//		for(int i = 0;i<��4.length;i++) {
//			System.out.println(��4[i]);
//		}
		for(String name:��4) {
			System.out.println(name);
		}
		
		System.out.println("��ȣ�� �Է��ϼ���. �̸��� �˷��帳�ϴ�.");
		// �Է�����
		Scanner scanner = new Scanner(System.in);
		for(;;) {
		//while (true) {
			// ----
			int number = scanner.nextInt();
			//1<=number<=18
			if(1<=number && number<=��4.length) {
				// �������
				System.out.println(��4[number - 1]);
			} else {
				break;
			}
			// ---
		}

//		if(number == 1) {
//			System.out.println("������");
//		} else if(number == 2) {
//			System.out.println("������");
//		} else if(number == 3) {
//			System.out.println("�谡��");
//		} else if(number == 4) {
//			System.out.println("�質��");
//		}

//		switch (number) {
//		case 1:
//			System.out.println("������");
//			break;
//		case 2:
//			System.out.println("������");
//			break;
//		case 3:
//			System.out.println("�谡��");
//			break;
//		case 4:
//			System.out.println("�質��");
//			break;
//
//		default:
//			break;
//		}

	}
}
