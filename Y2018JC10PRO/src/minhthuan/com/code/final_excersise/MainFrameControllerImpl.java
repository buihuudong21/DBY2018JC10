package minhthuan.com.code.final_excersise;

import java.util.List;

public class MainFrameControllerImpl implements IMainFrameController {
	private MainFrameQuery mainFrameQuery;

	public MainFrameControllerImpl() {
		mainFrameQuery = new MainFrameQuery();
	}

	@Override
	public List<Student> getAllStudents() {

		return mainFrameQuery.getStudents();

	}

}
