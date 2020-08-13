package dynamic_beat_13;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player; //자바줌사이트 라이브러리
	private boolean isLoop; //한번 재생후 꺼지는지 설정
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop =isLoop;
			file= new File(Main.class.getResource("../music/"+name).toURI());
			fis= new FileInputStream(file);
			bis= new BufferedInputStream(fis);
			player=new Player(bis);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() { //현재 어떤위치에 실행되고있는지
		if(player==null)
			return 0;
		return player.getPosition();
	}
	public void close() { //음악이 언제 실행되고있더라도 항상 종료할수있도록 하는 함수
		isLoop=false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
				fis= new FileInputStream(file);
				bis= new BufferedInputStream(fis);
				player=new Player(bis);
				
			} while(isLoop);  
		
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
}