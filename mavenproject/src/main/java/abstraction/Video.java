package abstraction;

public class Video extends Google {
	
	public void search() {
		System.out.println("Video Search");
	}
	public static void main(String[] args) {
		
		Video vd = new Video();
		vd.search();
		Image img = new Image();
		img.search();

	}

}
