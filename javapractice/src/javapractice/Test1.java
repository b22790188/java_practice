package javapractice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test1{
	
	public static void main(String[] args) {
		// �إ�JFrame
        JFrame frame = new JFrame("hello,world");
        // �]�w�ؤo
        frame.setSize(200, 100);
        // JFrame�b�ù��~��
        frame.setLocationRelativeTo(null);
        // JFrame�����ɪ��ާ@
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ���JFrame
        frame.setVisible(true);
	}
}
