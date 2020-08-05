package dynamic_beat_2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Image;

public class DynamicBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground; 
	
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false); // â ũ�� �������
		setLocationRelativeTo(null); //����â�� ��ǻ�� ���߾ӿ� �� 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� ���α׷��� ����
		setVisible(true); //���� â�� ��µǵ��� 
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg")).getImage();
		
	}
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic =screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
		
	}
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground,0,0,null);
		this.repaint();
		
	}
}
