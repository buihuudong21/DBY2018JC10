package teacher.com.javacore.Swing_apps.SAMPLES;

public class AccountController {
	private AccountModel mModel;

	public AccountController() {
		mModel = new AccountModel();
	}

	public boolean CheckAccount(AccountEntity objEntity) {
		return mModel.CheckElementById(objEntity);
	}
}
