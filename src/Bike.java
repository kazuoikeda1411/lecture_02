public class Bike {
	private String name;
	private int speed;
	public String getName() {
		return this.name;
	}
	public int getSpeed() {
		return this.speed;
	}
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
			}
		}
	}

	public void showIsSpeedingOrSafeDriving() {
		System.out.println("走行速度を測定しました。");
		if (this.speed > 80) {
			System.out.println(this.name + "はスピード違反です。速度を落としてください。");
		} else {
			System.out.println(this.name + "は安全運転です。");
			System.out.println("---------------------------------------");
		}
	}
}
