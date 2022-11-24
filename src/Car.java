import java.util.ArrayList;

public class Car {

	private String name;
	private int speed;

	public Car (String name, int speed) {
		this.name = name;
		this.speed = speed;
	}


	public String getName () {
		return name;
	}

	public int getSpeed () {
		return speed;
	}


	public static void generateBikeList () {
		ArrayList<Car> list = new ArrayList<> ();
		list.add (new Car ("トヨタ", 70));
		list.add (new Car ("ベンツ", 150));
		list.forEach (s -> System.out.println ("車種：" + s.name + "/" + "速度：" + s.speed));
	}

	public void crash () {
		if (this.getSpeed () > 80) {
			System.out.print ("「");
			for (int i = 0; i < this.getSpeed (); i = i + 10) {
				System.out.print ("!");
			}
			System.out.print ("」");
			if (this.getSpeed () > 250) {
				System.out.println ("事故を起こしました。");
			} else if (80 < this.getSpeed ()) {
				System.out.println ("違反切符を切られました。");
			}
		}
	}

	public void isSpeeding () {
		if (this.speed > 80) {
			System.out.println (this.getName () + "はスピード違反です。速度を落としてください。");
		} else {
			System.out.println (this.getName () + "は安全運転です。");
		}
	}

	public void clean () {
		System.out.println ("");
	}
}
