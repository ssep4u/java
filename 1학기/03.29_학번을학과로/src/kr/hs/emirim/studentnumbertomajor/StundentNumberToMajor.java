package kr.hs.emirim.studentnumbertomajor;

import java.util.Scanner;

public class StundentNumberToMajor {
	public static void main(String[] args) {
		String[] �г�3 = {"���ͷ�Ƽ��̵���", "���ͷ�Ƽ��̵���",
				"���̵������ΰ�", "���̵������ΰ�", "���̵��ַ�ǰ�", "���̵��ַ�ǰ�"};
		String[] �г�2 = {"���̵�����Ʈ�����", "���̵�����Ʈ�����",
				"���̵�����ַ�ǰ�", "���̵�����ַ�ǰ�", "���̵������ΰ�", "���̵������ΰ�"};
		//�й��� �Է¹���
		Scanner scanner = new Scanner(System.in);
		String studentNumber = scanner.nextLine();
		
		//�а��� �������
		//0��° ���ڰ� 3�̸�
		if(studentNumber.substring(0, 1).equals("3")) {
			//1,2�� ���ͷ�Ƽ��̵��, 3,4�� ���̵�������, 5,6�� ���̵��ַ��
			String classroomStr = studentNumber.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(�г�3[classroom]);
//			if(studentNumber.substring(1, 2).equals("1")
//					|| studentNumber.substring(1, 2).equals("2")) {
//				System.out.println("���ͷ�Ƽ��̵���");
//			} else if(studentNumber.substring(1, 2).equals("3")
//					|| studentNumber.substring(1, 2).equals("4")) {
//				System.out.println("���̵������ΰ�");
//			} else if(studentNumber.substring(1, 2).equals("5")
//					|| studentNumber.substring(1, 2).equals("6")) {
//				System.out.println("���̵��ַ�ǰ�");
//			}
		} else {
			//0��° ���ڰ� 3�� �ƴϸ�
			//1,2�� ���̵�����Ʈ����, 3,4�� ���̵�����ַ��, 5,6�� ���̵�������
			String classroomStr = studentNumber.substring(1,2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(�г�2[classroom]);
			
//			if(studentNumber.substring(1, 2).equals("1")
//					|| studentNumber.substring(1, 2).equals("2")) {
//				System.out.println("���̵�����Ʈ�����");
//			} else if(studentNumber.substring(1, 2).equals("3")
//					|| studentNumber.substring(1, 2).equals("4")) {
//				System.out.println("���̵�����ַ�ǰ�");
//			} else if(studentNumber.substring(1, 2).equals("5")
//					|| studentNumber.substring(1, 2).equals("6")) {
//				System.out.println("���̵������ΰ�");
//			}
		}

	}

}











