package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false); // 창 크기를 줄이거나 늘리거나
		setLocationRelativeTo(null); //게임창이 컴퓨터 정중앙에 뜸 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임종료시 프로그램이 종료
		setVisible(true); //게임 창이 출력되도록 
		
	}
}
