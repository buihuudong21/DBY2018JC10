package buihuudong.implmylist;

public class AppTest {

	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<String>();
		list.add("Viet Nam");
		list.add("Trung Quoc");
		list.add("Campuchia");
		list.add("Thailand");
		list.add("Singapor");

		System.out.println(list);
		list.remove(0);
		System.out.println(list);

	}

}
