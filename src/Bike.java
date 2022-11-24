import java.util.ArrayList;

public class Bike {

	public String name;
	public int speed;

	public Bike (String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public String getName () {
		return name;
	}

	public int getSpeed () {
		return speed;
	}

//	public void name (String name) {
//		this.name = name;
//	}
//
//	public void speed (int speed) {
//		this.speed = speed;
//	}

	public void crash () {
		if (this.speed > 80) {
			System.out.print ("「");
			for (int i = 0; i < this.speed; i = i + 10) {
				System.out.print ("!");
			}
			System.out.print ("」");
			if (this.speed > 120) {
				System.out.println ("事故を起こしました。");
			} else if (80 < this.speed) {
				System.out.println ("違反切符を切られました。");
			}
		}
	}

	public void isSpeeding () {
		if (this.speed > 80) {
			System.out.println (this.name + "はスピード違反です。速度を落としてください。");
		} else {
			System.out.println (this.name + "は安全運転です。");
		}
	}

	public static void generateBikeList () {
		ArrayList<Bike> list = new ArrayList<> ();
		list.add (new Bike ("原付", 30));
		list.add (new Bike ("スズキ", 90));
		list.add (new Bike ("ホンダ", 150));
		list.forEach (s -> System.out.println ("車種：" + s.name + "/" + "速度：" + s.speed));
	}
}
