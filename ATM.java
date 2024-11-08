package Atm;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		System.out.println("welcome to our ATM service"+ "\nplease insert ur card");
		System.out.println("enter your pin");
		Scanner sc = new Scanner(System.in);
			int pin =sc.nextInt();
			int pin1=1234;
			int balance=524;
			if(pin==pin1) {
				System.out.println("1.deposit"+"\n2.checkbalance"+"\n3.withdraw"+"\n4.cancel");
				int input=sc.nextInt();
				switch (input) {
				case 1:
					System.out.println("enter the deposit amount:");
					int deposit=sc.nextInt();
					 balance=deposit+balance;
					System.out.println("cuerrent balance : "+ balance +"\nthank you12");
					break;
				case 2:
					System.out.println(balance);
					break;
				case 3:
					System.out.println("enter the amount to withdraw ;");
					int withdraw=sc.nextInt();
					if(withdraw>balance) {
						System.out.println("insuffucient balance :");
						System.out.println(balance);
						System.out.print("try again");
					}
					else {
						System.out.println("collect your cash");
						System.out.print("your current balance : ");
						System.out.print(balance=balance-withdraw);
					}
					break;
				case 4:
					System.out.print("thank you for the transaction");
					break;
				}
				
			}
			else {
				System.out.print("access denied");
			}
		}
		}
		

