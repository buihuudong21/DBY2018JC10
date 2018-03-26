package teacher.com.javacore.oops.demostatic;

public class DemoStatic01 {
	// private String sName;
	// private String Address;

	// private static String NameOfUniver = "IMIC";
	private static int count = 10;

	public DemoStatic01() {
		count++;
	}

	// public DemoStatic01(String sName, String Address) {
	// this.sName = sName;
	// this.Address = Address;
	// }

	public static void main(String[] args) {
		double pi = Math.PI;
		DemoStatic01 sv1 = new DemoStatic01();
		System.out.println(sv1.count); // 0, 1
		DemoStatic01 sv2 = new DemoStatic01();
		System.out.println(sv2.count);// 0, 1, 2?

		for (int i = 0; i < 100; i++) {
			new DemoStatic01();
		}
		System.out.println(count);// ? 2 - 1

	}

}
