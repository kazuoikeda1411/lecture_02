import java.util.ArrayList;
import java.util.List;

public record Car(String name, int speed) {

	public static void generateBikeList() {
		List<Car> carList = new ArrayList<>();
		carList.add(new Car("トヨタ", 70));
		carList.add(new Car("ベンツ", 150));
		carList.forEach(s -> System.out.println("車種：" + s.name + "/" + "速度：" + s.speed + "km/h"));
		System.out.println("---------------------------------------");
	}

	public void crash() {
		if (this.speed() > 80) {
			System.out.print("「");
			for (int i = 0; i < this.speed(); i = i + 10) {
				System.out.print("!");
			}
			System.out.print("」");
			if (this.speed() > 250) {
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
			System.out.println(this.name() + "はスピード違反です。速度を落としてください。");
		} else {
			System.out.println(this.name() + "は安全運転です。");
			System.out.println("---------------------------------------");
		}
	}

	public void clean() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
