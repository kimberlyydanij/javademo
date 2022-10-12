package java006_class.part09;

public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song(){}
	
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
	
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.println("노래제목 :"+this.title);		
		System.out.println("가수 : "+this.artist);
		System.out.println("앨범 : "+this.album);
		System.out.printf("작곡가 : ");
		for(int i=0;i<=this.composer.length-1;i++)
		{
			if(i!=this.composer.length-1) {
			System.out.printf("%s, ",this.composer[i]); }
			else { System.out.printf("%s",this.composer[i]);}
			
		}
		System.out.println();
		//System.out.println("작곡가 : "+this.composer);
		System.out.println("년도 : "+this.year);
		System.out.println("트랙 : "+this.track);
	}
}
