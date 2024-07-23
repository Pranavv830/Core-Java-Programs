package hmp;

import java.util.Scanner;

public class HotelImp extends Hotel {

	private String name;
	private String address;
	private String type;
	private long phno;
	private String timing;
	
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getType() {
		return type;
	}

	public long getPhno() {
		return phno;
	}

	public String getTiming() {
		return timing;
	}

	

	@Override
	public void displayDetails() {
		
		
	}

	public HotelImp(String name, String address, String type, long phno, String timing) {
		super();
		this.name = name;
		this.address = address;
		this.type = type;
		this.phno = phno;
		this.timing = timing;
	}

	@Override
	public void menu() {
		System.out.println("_____WELCOME TO "+name+"_____");
		System.out.println();
		
		System.out.println("Dish                        price");
		System.out.println("_________________________________");
		System.out.println("Poha                           20");
		System.out.println("Vadapav                        15");
		System.out.println("Upma                           20");
		System.out.println("Idali                          35");
		System.out.println("Meduvada                       40");
		System.out.println("Pattice                        20");
		System.out.println("Dosa                           40");
		System.out.println("Samosa                         15");
		System.out.println();
	}

	@Override
	public void orderFood() {
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter a dish which you want to order!");
		String dish = sc.next();
		double total = 0;
		System.out.println("Enter a Quentity");
		int qty = sc.nextInt();
		
		System.out.println("Your order is: "+dish+" and quentity is "+qty);
		switch (dish) {
		
		case "Poha":
		case "Upma":
		case "Pattice":
		{
			total = qty*20;
			System.out.println("Payable amount is: "+ total);
			break;
		}
		case "Vadapav":
		case "Samosa":
		{
			total = qty*15;
			System.out.println("Payable amount is: "+ total);
			break;
		}
		case "Idali":
		{
			total = qty*35;
			System.out.println("Payable amount is: "+ total);
			break;
		}
		case "Meduvada":
		case "Dosa":
		{
			total = qty*40;
			System.out.println("Payable amount is: "+ total);
			break;
		}

		default:
		    System.out.println("Food not in menu Today");
		}
		
		if (total != 0) {
			payment(total);
			review();
		}
		
	}

	@Override
	public void payment(double toBePaid) {
		
		double amt = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------------------------------");
			System.out.println("Enter the Amount");
			amt = sc.nextDouble();
			
			if (toBePaid == amt) {
				System.out.println("Payment Sccesfull");
				gritings();
				break;
			}
			
			else if (amt > toBePaid) {
				System.out.println("Payment Sccesfull");
				System.out.println("Collect the change of: "+(amt-toBePaid));
				gritings();
				break;
			}
			else {
				System.out.println("Pay the bill with total Displayed Amount!");
			}
		} while (amt!=toBePaid);
		
	}

	@Override
	public void review() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter your rating between 0-5");
		int rating = sc.nextInt();
		System.out.println("Enter your Review");
		sc.nextLine();
		String review = sc.nextLine();
		
		if (rating >= 0 && rating <= 5) {
			
			if (rating >= 0 && rating <= 2) {
				System.out.println("Sorry for bad experience");
			}
			if (rating == 3) {
				System.out.println("We will try to match your experience exeption next time !");
			}
			else {
				gritings();
			}
			
		}
		
	}

	
}
