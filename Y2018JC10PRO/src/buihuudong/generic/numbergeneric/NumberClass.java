package buihuudong.generic.numbergeneric;

public class NumberClass extends GenericNumber<Integer, Integer, Integer> {

	@Override
	protected Integer add(Integer e, Integer f) {

		return (e + f);
	}

	@Override
	protected Integer multiply(Integer e, Integer f) {

		return (e * f);
	}

}
