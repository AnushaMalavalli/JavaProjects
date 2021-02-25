package day2;

public class AccountAppln {

	public static void main(String[] args) {
		Account account= new Account();
		account.setAcno(1234);
		account.setAcname("new123");
		account.setSalary(60000);
		System.out.println(account.getAcno()+" "+account.getAcname()+" "+account.getSalary());

	}

}
