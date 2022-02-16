package proj03;

import java.util.Scanner;

public class Smartphone {

	Contact[] contacts;
	int countOfContact = 0;
	Scanner in;
	
	public Smartphone() {
		this.contacts = new Contact[10];
		in = new Scanner(System.in);
	}																	// call back
	public Contact inputContactData(int type) {
		System.out.println("이름 : ");
		String name = in.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = in.nextLine();
		System.out.println("이메일 : ");
		String email = in.nextLine();
		System.out.println("주소 : ");
		String adress = in.nextLine();
		System.out.println("생일 : ");
		String birthday = in.nextLine();
		System.out.println("그룹 : ");
		String group = in.nextLine();
		
		Contact contact = null;
		
		if(type==1) {
			System.out.println("회사이름 : ");
			String company = in.nextLine();
			System.out.println("부서이름 : ");
			String depart = in.nextLine();
			System.out.println("직급 : ");
			String job = in.nextLine();
			
			contact = new CompanyContact(name, phoneNumber, email, adress, birthday, group, company, depart, job);
			
		}else if(type==2) {
			System.out.println("거래처이름 : ");
			String company = in.nextLine();
			System.out.println("부서이름 : ");
			String depart = in.nextLine();
			System.out.println("직급 : ");
			String job = in.nextLine();
			
			contact = new CompanyContact(name, phoneNumber, email, adress, birthday, group, company, depart, job);
			
		}
		return contact;
	}
	// 배열에 연락처 객체 저장
		public void addContact(Contact contact) {
			contacts[countOfContact] = contact;
			countOfContact++;
			System.out.println(">>>데이터가 저장되었습니다. ("+countOfContact+")");
		}
		public void printContact(Contact contact) {
			System.out.println("-------------------------------------------------------------");
			contact.printInfo();
			System.out.println("-------------------------------------------------------------\n");
		}
		// 모든 연락처 출력
		public void printAllContact() {
			for (int i = 0; i < countOfContact; i++) {
				printContact(contacts[i]);
	  }
	}
		// 연락처 검색
		public Contact searchContact(String name) {
			for (int i = 0; i < countOfContact; i++) {
				Contact contact = contacts[i];
				if (contact.getName().contentEquals(name)) {
					printContact(contact);
					return contact;
				}
			}
			System.out.println("검색 결과가 없습니다.");
			return null;
		}
		// 연락처 삭제
		public void deleteContact(String name) {
			for (int i = 0; i < countOfContact; i++) {
				Contact contact = contacts[i];
				if (contact.getName().contentEquals(name)) {
					for(int j = i; j < countOfContact; j++) {
						contacts[j] = contacts[j+1];
					}
					countOfContact--;
					return;
				}
			}
			System.out.println("검색 결과가 없습니다.");
		}
		// 연락처 수정
		public void editContact(String name, Contact newContact) {
			for(int i = 0; i < countOfContact; i++) {
				if(contacts[i].getName().contentEquals(name)) {
					contacts[i] = newContact;
					return;
				}
			}
			System.out.println("검색 결과가 없습니다.");
		}
}
