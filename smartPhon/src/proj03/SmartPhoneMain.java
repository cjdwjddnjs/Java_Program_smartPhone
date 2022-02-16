package proj03;

import java.util.Scanner;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Smartphone smartPhone = new Smartphone();
		
		System.out.println("# 데이터 2개를 입력합니다.");
		for(int i =0; i < 2; i++) {
			smartPhone.addContact(smartPhone.inputContactData(i+1));
		}
		
		while(true) {
			printMenu();
			String choiceMenu = scanner.nextLine();
			
			if(choiceMenu.equals("1")) {
				smartPhone.addContact(smartPhone.inputContactData(1));
			} else if(choiceMenu.equals("2")) {
				smartPhone.addContact(smartPhone.inputContactData(2));
			}else if(choiceMenu.equals("3")) {
				smartPhone.printAllContact();
			}else if(choiceMenu.equals("4")){
				System.out.println("검색하고자 하는 이름을 입력해주세요.");
				smartPhone.searchContact(scanner.nextLine());
			}else if(choiceMenu.equals("5")) {
				System.out.println("삭제하고자 하는 이름을 입력해 주세요.");
				smartPhone.deleteContact(scanner.nextLine());
			}else if(choiceMenu.equals("6")) {
				System.out.println("수정하고자 하는 이름을 입력해 주세요.");
				String name = scanner.nextLine();
				Contact contact = smartPhone.searchContact(name);
				
				if(contact != null) {
					System.out.println("데이터를 새로 입력해 주세요");
					if(contact instanceof CompanyContact) {
						smartPhone.editContact(name,  smartPhone.inputContactData(1));
					}else if(contact instanceof CustomerContact) {
						smartPhone.editContact(name,  smartPhone.inputContactData(2));
					}
				}
				
			}else if(choiceMenu.equals("7")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 메뉴 입니다. 다시 선택해주세요.");
			}
		}
	}
	public static void printMenu() {
		System.out.println("Contact------------------------------------");
		System.out.println(">> 1. 연락처 등록(회사)");
		System.out.println(">> 2. 연락처 등록(거래처)");
		System.out.println(">> 3. 모든 연락처 출력");
		System.out.println(">> 4. 연락처 검색");
		System.out.println(">> 5. 연락처 삭제");
		System.out.println(">> 6. 연락처 수정");
		System.out.println(">> 7. 프로그램 종료");
		System.out.println("-------------------------------------------");
	}

}
