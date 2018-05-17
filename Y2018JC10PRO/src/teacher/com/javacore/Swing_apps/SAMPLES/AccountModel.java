package com.teacher.Swing_apps.SAMPLES;

public class AccountModel {
	public boolean CheckElementById(AccountEntity objEntity) {
		return (objEntity.getsUserName().equals("abc") && objEntity.getsPassWord().equals("nothing")) ? true : false;
	}
}
