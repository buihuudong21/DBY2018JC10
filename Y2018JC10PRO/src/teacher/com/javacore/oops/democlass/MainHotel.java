package teacher.com.javacore.oops.democlass;

public class MainHotel {

	public static void main(String[] args) {
		// 1. Khởi tạo đối tượng dữ liệu Hotel
		Hotel hotelPackson = new Hotel("Packson", "Yellow", 200, 50, false);
		Hotel hotelNewWorld = new Hotel("New World", "Gray", 3000, 200, true);

		// 2. Sử dụng phương thức của đối tương
		// Hiển thị thông tin về khách san

		hotelPackson.DisplayInforHotel();
		hotelPackson.incrementBookedRoom(5);
		hotelPackson.DisplayInforHotel();

		// 3. Tạo đối tượng mới - không dùng hàm tạo
		Hotel hotelHoaPhuong = new Hotel();
		hotelHoaPhuong.setName("Hoa Phượng");
		hotelHoaPhuong.setColor("Red");
		hotelHoaPhuong.setTotalRoom(120);
		hotelHoaPhuong.setBookedRoom(20);
		hotelHoaPhuong.setPool(true);
		hotelHoaPhuong.DisplayInforHotel();
		// 4. hiển thi tên khách sạn
		System.out.println(hotelHoaPhuong.printName());

	}

}
