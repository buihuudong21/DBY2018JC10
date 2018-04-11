package teacher.com.javacore.mvc.demo_mvc_at_class_2;

public class ModelStudent {
	// 1. Viết hàm tra ra điểm thấp nhấp
	private float FindMinMark(StudentArray arrStudent) {
		float fReturn = arrStudent.getArrStudent()[0].getfMark();
		// Giải thuật tìm điểm thấp nhất

		for (int i = 1; i < arrStudent.getArrStudent().length; i++) {
			if (arrStudent.getArrStudent()[i].getfMark() < fReturn) {
				fReturn = arrStudent.getArrStudent()[i].getfMark();
			}
		}

		return fReturn;
	}

	// 2. Viết hàm tra ra điểm cao nhất
	private float FindMaxMark(StudentArray arrStudent) {
		float fReturn = arrStudent.getArrStudent()[0].getfMark();
		// Giải thuật tìm điểm thấp nhất
		for (Student student : arrStudent.getArrStudent()) {
			if (fReturn < student.getfMark()) {
				fReturn = student.getfMark();
			}
		}

		return fReturn;
	}

	// Tùy theo tìm min hay max căn cứ vào btIndexMaxorMin (0: min, 1: Max)
	public int[] listIndexMax(StudentArray obj) {
		// 1 Định nghĩa mảng chứa chỉ số trả ra
		int[] arrReturn = null;
		// 2. Để đếm số lượng có giá trị min/max
		int vCount = 0;
		// 3. Khởi tạo một mảng chứa số lượng sinh viên
		int[] arrTemp = new int[obj.getArrStudent().length];
		// 4. Xác định chỉ số có giá trị max/min

		for (int i = 0; i < obj.getArrStudent().length; i++) {
			if (obj.getArrStudent()[i].getfMark() == this.FindMaxMark(obj)) {
				arrTemp[vCount] = i;
				vCount++;
			}
		}
		arrReturn = new int[vCount];
		// 5. copy từ mảng temp sang mảng thật để return ra ngoài
		System.arraycopy(arrTemp, 0, arrReturn, 0, vCount);

		return arrReturn;
	}

}
