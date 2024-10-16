package shekharSirPrograms;

public class SBIAcct extends BankAcct {

	SBIAcct(){
		System.out.println("this is sbi ac constructor");
	}
	public static void main(String[] args) {
		SBIAcct sbiandheriAcct = new SBIAcct() ;
		//Below methods inherited from BankAcct Class
		sbiandheriAcct.setBankName("SBI"); 
		sbiandheriAcct.setBranchAddress("Andheri");
	}
}
