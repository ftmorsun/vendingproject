package vendingmachineproject;

import java.util.Scanner;

public class Methods {
	
	//I need to select a product and set the price
	public double select(Products product) {
		
		System.out.println(product.toString());
		Scanner scan = new Scanner(System.in);
		//invalid option
		do {
			System.out.println("Enter product number from 1 to 10, please:");
			product.setProductNum(scan.nextInt());
			if(product.getProductNum()<1 || product.getProductNum()>10) {
				System.out.println("Please enter a valid product number!");
			}
		}while(product.getProductNum()<1 || product.getProductNum()>10);
		//Valid option
		switch(product.getProductNum()) {
		case 1:
			product.setPrice(product.getSnicker());
			break;
		case 2:
			product.setPrice(product.getChipsAhoy());
			break;
		case 3:
			product.setPrice(product.getPringles());
			break;
		case 4:
			product.setPrice(product.getMilano());
			break;
		case 5:
			product.setPrice(product.getReeses());
			break;
		case 6:
			product.setPrice(product.getCocaCola());
			break;
		case 7:
			product.setPrice(product.getFanta());
			break;
		case 8:
			product.setPrice(product.getWater());
			break;
		case 9:
			product.setPrice(product.getArizona());
			break;
		case 10:
			product.setPrice(product.getSkittles());
			break;
		}
		return product.getPrice();
	
		
	}

}
