package javapractice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test1{
	
	public static void main(String[] args) {
		// 建立JFrame
        JFrame frame = new JFrame("hello,world");
        // 設定尺寸
        frame.setSize(200, 100);
        // JFrame在螢幕居中
        frame.setLocationRelativeTo(null);
        // JFrame關閉時的操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 顯示JFrame
        frame.setVisible(true);
	}
}
