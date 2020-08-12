package dynamic_beat_11;

//하나의 곡에대한 정보를 담는 클래스
// 해당곡의 표지,제목,음악파일 등등
public class Track {

	private String titleImage; //제목 부분 이미지
	private String startImage; //게임 선택 창 표지 이미지
	private String gameImage; //해당 곡을 실행했을 때 표지 이미지
	private String startMusic; //게임 선택 창 음악
	private String gameMusic; //해당 곡을 실행했을때  음악
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImgae() {
		return gameImage;
	}
	public void setGameImgae(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic) {
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}
	
}
