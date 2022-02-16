package proj03;

public class CompanyContact extends Contact {

	private String company;
	private String depart;
	private String job;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		super(name, phoneNumber, email, address, birthday, group);
		// TODO Auto-generated constructor stub
	}
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group, String company, String depart, String job) {
		super(name, phoneNumber, email, address, birthday, group);
		this.company = company;
		this.depart = depart;
		this.job = job;
  }
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("회사이름 : " + this.company);
		System.out.println("부서이름 : " + this.depart);
		System.out.println("직급 : " + this.job);
	}
}
