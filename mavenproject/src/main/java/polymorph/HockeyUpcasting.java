package polymorph;

public class HockeyUpcasting extends CricketUpcasting {

	public void play() {
		System.out.print("Child");
	}
	
	public static void main(String[] args) {
		CricketUpcasting cricketupcasting;
		cricketupcasting =new FootballUpcasting();
		cricketupcasting.play();
		cricketupcasting = new HockeyUpcasting();
		cricketupcasting.play();
		cricketupcasting = new CricketUpcasting();
		cricketupcasting.play();
		

	}

}
