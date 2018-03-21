package teacher.com.javacore.structureprogramming.breakcontinue;

public class continue_demo {

	public static void main(String[] args) {
		// 1. Định nghĩa một chuỗi cho trước và ký tự cần tìm
		String strSearch = "ain chao asaaaaaaaaaaatat ca cac chuyen gia tham du trong lop hoc java core tai imic!";
		strSearch = strSearch.toUpperCase();
		char desSearch = 'A';
		int pos = 0; // Biến lưu số lượng mà desSearch có trong chuỗi cần tìmA
		// 2. Lấy chiều dài của huỗi bằng hàm length()
		int max = strSearch.length();

		for (int i = 0; i < max; i++) {
			if (strSearch.charAt(i) != desSearch)
				continue;
			pos++;
		}
		System.out.println("Đã tìm được " + pos + " kí tự a trong chuỗi");

	}

}
