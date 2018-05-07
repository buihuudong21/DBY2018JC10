package teacher.com.javacore.ExceptionHandling.UserDefineException.demouserdefine;

public class UsingCheckAgeException {
	private int age;

	public UsingCheckAgeException() {

	}

	public UsingCheckAgeException(int age) throws InvalidAge {
		// Ta dung Exception InvalidAge
		this.setAge(age);
		// new InvalidAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAge {
		if (age < 18) {
			// ném đối tượng chứa message lỗi ra ngoài
			throw new InvalidAge(age);
		}
		this.age = age;
	}

}
