package teacher.com.javacore.baitaptonghop;

public class Database {
	// 1. Định nghĩa thuộc tính chứa một mảng các đối tượng là KH
	private Customer[] arrCustomer;

	// 2 Dùng hàm tạo để truyền danh sách các KH
	public Database() {
		arrCustomer = new Customer[] { new Customer(1, "Vũ Diễm Quỳnh", "Quận 1, HCM", "09100010101", 150000000d),
				new Customer(2, "Trần Thuỳ Trang", "Quận 2, HCM", "09100010101", 250000000d),
				new Customer(3, "Đàm Ngọc Ánh", "Quận 4, HCM", "09100010101", 40000000d),
				new Customer(4, "Nguyễn Hoà Thuận", "Quận 3, HCM", "09100010101", 140000000d),
				new Customer(5, "Võ Thống", "Quận 5, HCM", "09100010101", 130000000d),
				new Customer(6, "Nguyễn Đức Vinh", "Quận 7, HCM", "09100010101", 1550000000d) };

	}
	// 3. xây dựng hàm get để return mảng ra ngoài (cho đối tượng khác dùng)

	public Customer[] getArrCustomer() {
		return arrCustomer;
	}

}
// int[] arr = {1,2,3}; int[] arr = new int[20]; arr[0] = 1;
// int[] arr = new int[]{1,2,3};