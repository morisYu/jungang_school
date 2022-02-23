package examPractice;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count;
	
	public static void main(String[] args) {
		boolean run = true;
		
		for(int i=0;i<100;i++) {
			accountArray[i]= new Account();
		}
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	// 계좌 생성
	private static void createAccount() {
		
		String ano;
		String owner;
		int balance;
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i].getOwner()==null) {
				System.out.println("계좌순번: "+i);
				count = i;
				break;
			}
		}
		
		System.out.print("신규 계좌번호 입력> ");
		ano=scanner.next();
		accountArray[count].setAno(ano);
		
		System.out.print("계좌주 이름 입력> ");
		owner=scanner.next();
		accountArray[count].setOwner(owner);
		
		System.out.print("초기 입금액 입력> ");
		balance=scanner.nextInt();
		accountArray[count].setBalance(balance);
		
	}
	
	// 계좌목록
	private static void accountList() {
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("계좌목록");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<=count;i++) {
			System.out.println(accountArray[i].getOwner()+" 님의 계좌");
			System.out.println("계좌번호> "+accountArray[i].getAno());
			System.out.println("잔액> "+accountArray[i].getBalance());
			System.out.println("\n");
		}
	}
	
	// 예금
	private static void deposit() {
		
		int oldBalance;
		int newBalance;
		int balance;
		String ano;
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("예금");
		System.out.println("-----------------------------------------");
		
		System.out.print("계좌번호를 입력하세요> ");
		ano=scanner.next();
		
		for(int i=0;i<=count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				oldBalance=accountArray[i].getBalance();
				
				System.out.print("예금액을 입력하세요> ");
				newBalance=scanner.nextInt();
				
				balance=oldBalance+newBalance;
				accountArray[i].setBalance(balance);
				
				System.out.println(newBalance+" 입급되었습니다");
				System.out.println("계좌 잔액> "+accountArray[i].getBalance());
				return;
			}
		}
		System.out.println("계좌번호를 다시 확인하세요.");
	}
	
	// 출금
	private static void withdraw() {
		
		int oldBalance;
		int newBalance;
		int balance;
		String ano;
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("출금");
		System.out.println("-----------------------------------------");
		
		System.out.print("계좌번호를 입력하세요> ");
		ano=scanner.next();
		
		for(int i=0;i<=count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				oldBalance=accountArray[i].getBalance();
				
				System.out.print("예금액을 입력하세요> ");
				newBalance=scanner.nextInt();
				
				balance=oldBalance-newBalance;
				if(balance<0) {
					System.out.println(Math.abs(balance)+" 부족합니다.");
					return;
				}
				accountArray[i].setBalance(balance);
				
				System.out.println(newBalance+" 출급되었습니다");
				System.out.println("계좌 잔액> "+accountArray[i].getBalance());
				return;
			}
		}
		System.out.println("계좌번호를 다시 확인하세요.");
	}
}
