package teacher.com.javacore.ExceptionHandling.demo_onsite.example03;

public class RunCheckAgeException {
	private int age;

	public RunCheckAgeException() {

	}

	public int getAge() {
		return age;
	}

	public RunCheckAgeException(int age) throws InvalidAgeArmy {
		this.setAge(age);
	}

	public void setAge(int age) throws InvalidAgeArmy {
		if (age < 18) {
			throw new InvalidAgeArmy(age);
		}
		this.age = age;

	}

}
