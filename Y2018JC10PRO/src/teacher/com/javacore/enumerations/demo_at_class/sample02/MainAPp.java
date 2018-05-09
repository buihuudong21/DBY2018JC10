package teacher.com.javacore.enumerations.demo_at_class.sample02;

public class MainAPp {

	public static void main(String[] args) {
		// 1. Khai bao cac doi tuong
		System.out.println("Size cua A la: " + AppleEnum.A.getSize());
		System.out.println("Size cua B la: " + AppleEnum.B.getSize());
		System.out.println("Size cua C la: " + AppleEnum.C.getSize());
		System.out.println("Size cua D la: " + AppleEnum.D.getSize());
		// 2. Dua vao mot mang
		AppleEnum[] arrayApple = AppleEnum.values();

		for (AppleEnum appleEnum : arrayApple) {
			System.out.println(appleEnum);
		}
	}

}
