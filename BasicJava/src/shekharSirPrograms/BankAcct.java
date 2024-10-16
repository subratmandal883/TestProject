package shekharSirPrograms;

public class BankAcct {
	protected String ifscCode;
	private String bankName; 
	static String branchAddress;
	BankAcct(){
		System.out.println("this is bankacct constructor");
	}
	
	public String getIfscCode() {
		return ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public static String getBranchAddress() {
		return branchAddress;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public static void setBranchAddress(String branchAddress) {
		BankAcct.branchAddress = branchAddress;
	}
	
}


