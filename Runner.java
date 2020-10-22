package vendingmachineproject;

import java.util.Scanner;

public class Runner {
	static Products product; 
	static Scanner scan = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	static String buyAgain = "y";
	public static void main(String[] args) {
		System.out.println("Welcome to the vending Machine.\n Please put your bill to the enter bill box in the below. ");
		product = new Products();
		Methods method = new Methods();
		Delay.loading();
		do {
			System.out.println("Product Price= " + method.select(product));
				balance();
				Delay.loading();
				method.select(product);
				balance();
		}while(buyAgain.equals("y"));
		System.out.println("Good bye! See you next time!");
		
		}
	public static void balance() {
		
		
			if(product.getBalance()>product.getPrice()) {
				product.setBalance(product.getBalance()-product.getPrice());
				System.out.println("Balance= $" + product.getBalance());
				System.out.println("Would you like to buy anything else?(y/n)");
				buyAgain = input.next();
			}else {
				System.out.println("You do not have enough balance. \nWould you like to add money to your account?(y/n)");
				String ans = scan.next();
				if(ans.equals("y")) {
					System.out.println("How much would you like to add?");
					double addMoney =scan.nextDouble();
					product.setBalance(product.getBalance()+addMoney);
					System.out.println("New Balance = $" + product.getBalance());
				}else {
					System.out.println("Good bye! See you next time.");
				}
			}
		
	}
}

