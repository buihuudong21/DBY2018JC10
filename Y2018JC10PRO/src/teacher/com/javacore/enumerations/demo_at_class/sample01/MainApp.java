package teacher.com.javacore.enumerations.demo_at_class.sample01;

public class MainApp {

	public static void main(String[] args) {
		// 1. Gọi tới enum
		WeekDays weekDays = WeekDays.ChuNhat; // gọi đơn 1 giá trị
		System.out.println("Giá trị của weekday là: " + weekDays);// Coi value là const
		// 2. Gọi một tập weeks. Đưa về mảng với kiểu dữ liệu là WeekDays
		WeekDays[] arrData = WeekDays.values();
		// 3. lặp trong mảng để write ra màn hình
		for (WeekDays e : arrData) {
			System.out.println(e);
		}
	}

}
