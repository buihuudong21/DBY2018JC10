package teacher.com.javacore.mvc.sample02;

public class RectangeModel extends Shape {

	@Override
	public double Area(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return objEntity.getdWidth() * objEntity.getdHeight();
	}

	@Override
	public double Perrimetter(Object obj) {
		RectangeEntity objEntity = (RectangeEntity) obj;
		return 3 * (objEntity.getdHeight() + objEntity.getdWidth());
	}

}
