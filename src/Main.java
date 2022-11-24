public class Main {
	public static void main (String[] args) {
		Car car1 = new Car ("トヨタ", 70);
		Car car2 = new Car ("ベンツ", 150);

		Bike bike1 = new Bike ("原付", 30);
		Bike bike2 = new Bike ("スズキ", 90);
		Bike bike3 = new Bike ("ホンダ", 150);


		car1.generateBikeList ();
		car1.isSpeeding ();
		car1.crash ();
		car2.isSpeeding ();
		car2.crash ();
		car1.clean ();

		bike1.generateBikeList ();
		bike1.isSpeeding ();
		bike1.crash ();
		bike2.isSpeeding ();
		bike2.crash ();
		bike3.isSpeeding ();
		bike3.crash ();
		so
	}
}
