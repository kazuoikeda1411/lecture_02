import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("トヨタ", 70);
		Car car2 = new Car("ベンツ", 150);
		List<Car> carList = new ArrayList<>();
		carList.add(car1);
		carList.add(car2);
		carList.forEach(s -> System.out.println("車種：" + s.name() + "/" + "速度：" + s.speed() + "km/h"));
		System.out.println("---------------------------------------");

		Bike bike1 = new Bike("原付", 30);
		Bike bike2 = new Bike("スズキ", 90);
		Bike bike3 = new Bike("ホンダ", 150);
		List<Bike> bikeList = new ArrayList<>();
		bikeList.add(bike1);
		bikeList.add(bike2);
		bikeList.add(bike3);
		bikeList.forEach(s -> System.out.println("車種：" + s.getName() + "/" + "速度：" + s.getSpeed() + "km/h"));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		car1.showIsSpeedingOrSafeDriving();
		car1.crash();
		car2.showIsSpeedingOrSafeDriving();
		car2.crash();
		car1.clean();

		bike1.showIsSpeedingOrSafeDriving();
		bike1.crash();
		bike2.showIsSpeedingOrSafeDriving();
		bike2.crash();
		bike3.showIsSpeedingOrSafeDriving();
		bike3.crash();
	}
}
