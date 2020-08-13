package dynamic_beat_14;

public class Main {

	public static final int SCREEN_WIDTH=1280; // 해상도
	public static final int SCREEN_HEIGHT=720; //해상도
	public static final int NOTE_SPEED=3; //노트가 떨어지는 속도
	public static final int SLEEP_TIME=10; //  노트가 시간주기로 떨어짐
	public static final int REACH_TIME=2; // 판정바에 도달하는데 걸리는시간
	
	public static void main(String[] args) {
	
		new DynamicBeat();
		
	}

}
