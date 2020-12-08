package mypackage;

public class Songs {
	
	private String songName;
	private String songArtist;
	
	
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongArtist() {
		return songArtist;
	}
	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}
	public Songs(String songName, String songArtist) {
		super();
		this.songName = songName;
		this.songArtist = songArtist;
	}
	@Override
	public String toString() {
		return "Songs [songName=" + songName + ", songArtist=" + songArtist + "]";
	}
	
	
	
}
