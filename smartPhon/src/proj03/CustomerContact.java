package proj03;

public class CustomerContact extends Contact {
	
		private String company;
		private String product;
		private String job;

	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		super(name, phoneNumber, email, address, birthday, group);
		// TODO Auto-generated constructor stub
	}
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group, String company, String product, String job) {
		super(name, phoneNumber, email, address, birthday, group);
		this.company = company;
		this.product = product;
		this.job = job;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("거래처이름 : " + this.company);
		System.out.println("거래품목 : " + this.product);
		System.out.println("직급 : " + this.job);
	}
}
