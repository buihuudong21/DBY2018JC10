package teacher.com.javacore.jdbc_providers.demo_onsite_jdbc_provider;

public class Account {
	private String custid;
	private String fullName;
	private String accountNo;
	private double balance;

	public Account() {

	}

	public Account(String custid, String fullName, String accountNo, double balance) {

		this.custid = custid;
		this.fullName = fullName;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [custid=" + custid + ", fullName=" + fullName + ", accountNo=" + accountNo + ", balance="
				+ balance + "]";
	}

}
