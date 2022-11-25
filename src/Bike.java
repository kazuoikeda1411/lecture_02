import java.util.ArrayList;
import java.util.List;

public class Bike {

	public String name;
	public int speed;

	public Bike(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public void crash() {
		if (this.speed > 80) {
			System.out.print("「");
			for (int i = 0; i < this.speed; i = i + 10) {
				System.out.print("!");
			}
			System.out.print("」");
			if (this.speed > 120) {
				System.out.println("事故を起こしました。");
				System.out.println("---------------------------------------");
			} else {
				System.out.println("違反切符を切られました。");
				System.out.println("---------------------------------------");
			}
		}
	}

	public void isSpeeding() {
		System.out.println("走行速度を測定しました。");
		if (this.speed > 80) {
			System.out.println(this.name + "はスピード違反です。速度を落としてください。");
		} else {
			System.out.println(this.name + "は安全運転です。");
			System.out.println("---------------------------------------");
		}
	}

	public static void generateBikeList() {
		List<Bike> bikeList = new ArrayList<>();
		bikeList.add(new Bike("原付", 30));
		bikeList.add(new Bike("スズキ", 90));
		bikeList.add(new Bike("ホンダ", 150));
		bikeList.forEach(s -> System.out.println("車種：" + s.name + "/" + "速度：" + s.speed + "km/h"));
		System.out.println("---------------------------------------");
	}
}
