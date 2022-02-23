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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	// ���� ����
	private static void createAccount() {
		
		String ano;
		String owner;
		int balance;
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("���»���");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i].getOwner()==null) {
				System.out.println("���¼���: "+i);
				count = i;
				break;
			}
		}
		
		System.out.print("�ű� ���¹�ȣ �Է�> ");
		ano=scanner.next();
		accountArray[count].setAno(ano);
		
		System.out.print("������ �̸� �Է�> ");
		owner=scanner.next();
		accountArray[count].setOwner(owner);
		
		System.out.print("�ʱ� �Աݾ� �Է�> ");
		balance=scanner.nextInt();
		accountArray[count].setBalance(balance);
		
	}
	
	// ���¸��
	private static void accountList() {
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("���¸��");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<=count;i++) {
			System.out.println(accountArray[i].getOwner()+" ���� ����");
			System.out.println("���¹�ȣ> "+accountArray[i].getAno());
			System.out.println("�ܾ�> "+accountArray[i].getBalance());
			System.out.println("\n");
		}
	}
	
	// ����
	private static void deposit() {
		
		int oldBalance;
		int newBalance;
		int balance;
		String ano;
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("����");
		System.out.println("-----------------------------------------");
		
		System.out.print("���¹�ȣ�� �Է��ϼ���> ");
		ano=scanner.next();
		
		for(int i=0;i<=count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				oldBalance=accountArray[i].getBalance();
				
				System.out.print("���ݾ��� �Է��ϼ���> ");
				newBalance=scanner.nextInt();
				
				balance=oldBalance+newBalance;
				accountArray[i].setBalance(balance);
				
				System.out.println(newBalance+" �Ա޵Ǿ����ϴ�");
				System.out.println("���� �ܾ�> "+accountArray[i].getBalance());
				return;
			}
		}
		System.out.println("���¹�ȣ�� �ٽ� Ȯ���ϼ���.");
	}
	
	// ���
	private static void withdraw() {
		
		int oldBalance;
		int newBalance;
		int balance;
		String ano;
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("���");
		System.out.println("-----------------------------------------");
		
		System.out.print("���¹�ȣ�� �Է��ϼ���> ");
		ano=scanner.next();
		
		for(int i=0;i<=count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				oldBalance=accountArray[i].getBalance();
				
				System.out.print("���ݾ��� �Է��ϼ���> ");
				newBalance=scanner.nextInt();
				
				balance=oldBalance-newBalance;
				if(balance<0) {
					System.out.println(Math.abs(balance)+" �����մϴ�.");
					return;
				}
				accountArray[i].setBalance(balance);
				
				System.out.println(newBalance+" ��޵Ǿ����ϴ�");
				System.out.println("���� �ܾ�> "+accountArray[i].getBalance());
				return;
			}
		}
		System.out.println("���¹�ȣ�� �ٽ� Ȯ���ϼ���.");
	}
}
