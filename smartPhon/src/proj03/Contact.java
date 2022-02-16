package proj03;

public class Contact {
	
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String group;
	
	
	
	public Contact(String name, String phoneNumber, 
			String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
		
	}
		public void printInfo(Contact contacts) {
			System.out.println("이름"+ this.name);
			System.out.println("전화번호"+ this.phoneNumber);
			System.out.println("이메일"+ this.email);
			System.out.println("주소"+ this.address);
			System.out.println("생일"+ this.birthday);
			System.out.println("그룹"+ this.group);
			
		}
		
		public String getName() {
			return this.name;
		}
	

		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return this.phoneNumber;
		}
		
		public void setphoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			
		}
		public String getemail() {
			return this.email;
		}
	

		public void setemail(String email) {
			this.email = email;
			
		}
		public String getaddress() {
			return this.address;
		}
	

		public void setaddress(String address) {
			this.address = address;
		}
		public String getbirthday() {
			return this.birthday;
		}
	

		public void setbirthday(String birthday) {
			this.birthday = birthday;
			
		}
		public String getgroup() {
			return this.group;
		}
	

		public void setgroup(String group) {
			this.group = group;
		}
		public void printInfo() {
			// TODO Auto-generated method stub
			
		}
		
			
		
		
		
}
