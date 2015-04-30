package sds.icto55.example;

public class Ex3Main {

	public static void main(String[] args) {

//		Song s = new Song();
//		s.setAlbum("Real");
//		s.setArtist("아이유");
//		s.setComposer("이민수");
//		s.setTitle("좋은날");
//		s.setTrack(3);
//		s.setYear(2010);
		
		Ex3 s = new Ex3("좋은날","아이유","Real","이민수",2010,3);
		Ex3 song2 = new Ex3( "러빙유", "씨스타");
	    Ex3 song3 = new Ex3( "여수 밤바다", "버스커 버스커"); 
		
		s.show();
		song2.show();
		song3.show();

	}
}
