package billing;
import java.util.Scanner;
public class marketbilling  {
	static float sum=0;
	// to calculate and add the tax for the item
	void fruittax(int productprice,float amount) {
		float tax = (5/100f)*amount;
		float totalamount=amount+tax;
		System.out.println("netprice-"+totalamount);
		sum+=totalamount;
		
	}
	
	void vegetabletax(int productprice,float amount) {
		float tax = (3/100f)*amount;
		float totalamount=amount+tax;
		System.out.println("netprice-"+totalamount);
		sum+=totalamount;
	}
	//declare the items in array and its price in variables 
	void vegetables() {
		int quantity;
		float amount;
		String vegetable[]= {"carrot","cucumber","drumstick","potato","CONTINUE","EXIT"};
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter the product"+ "\n0.carrot-1kg(rs.50)"+"\n1.cucumber(rs.45)"+"\n2.drumstick(rs.6)"+"\n3.potato(rs.40)"+"\n4.CONTINUE" + "\n5.EXIT");
		int priceofcarrot=50;
		int priceofcucumber=45;
		int priceofdrumstick=6;
		int priceofpotato=40;
		int product = scan.nextInt();
		
		
		// if user enter valid input it run switch else print valid input
		if(product<=(vegetable.length)){  //vegetable.length for check length of the array
		switch(vegetable[product]) {
		case "carrot":
			System.out.println("carrot");
			 quantity=scan.nextInt();
			 amount=priceofcarrot*quantity;
			System.out.println("rs."+amount);
			vegetabletax(priceofcarrot,amount);
			vegetables();
			break;
		case "cucumber":
			System.out.println("cucumber");
			 quantity=scan.nextInt();
			 amount=priceofcucumber*quantity;
			System.out.println("rs."+amount);
			vegetabletax(priceofcucumber,amount);
			vegetables();
			
			break;
		case "drumstick":
			System.out.println("drumstick");
			 quantity=scan.nextInt();
			 amount=priceofdrumstick*quantity;
			System.out.println("rs."+amount);
			vegetabletax(priceofdrumstick,amount);
			vegetables();
			break;
		case "potato":
			System.out.println("potato");
			 quantity=scan.nextInt();
			 amount=priceofpotato*quantity;
			System.out.println("rs."+amount);
			vegetabletax(priceofpotato,amount);
			vegetables();
			break;
		case "CONTINUE":
			   	vegetables(); 	
			    	
	    case "EXIT":
			String[] args = {};
			main(args);
		//default:
		//	System.out.println("plese enter the valid input");
		}
		    
		}
		
		else {
			System.out.println("plese enter the valid input");
		}
		
	}
	//declare the items in array and its price in variables 
	void fruits() {
		int quantity;
		float amount;
		String fruits[]= {"apple","orange","banana","grapes","CONTINUE","EXIT"};
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter the product"+ "\n0.apple-1kg(rs.120)"+"\n1.orange-1kg(rs.105)"+"\n2.banana-1kg(rs.100)"+"\n3.grapes-1kg(rs.90)"+"\n4.CONTINUE" + "\n5.EXIT");
		int priceofapple=120;
		int priceoforange=105;
		int priceofbanana=100;
		int priceofgrapes=90;
		int product = scan.nextInt();
		
		
		// if user enter valid input it run switch else print valid input
	if(product<=(fruits.length)){  //fruit.length for check length of the array
		switch(fruits[product]) {
		case "apple":
			System.out.println("apple");
			 quantity=scan.nextInt();
			 amount=priceofapple*quantity;
			System.out.println("rs."+amount);
			fruittax(priceofapple,amount);
			fruits();
			break;
		case "orange":
			System.out.println("orange");
			 quantity=scan.nextInt();
			 amount=priceoforange*quantity;
			System.out.println("rs."+amount);
			fruittax(priceoforange,amount);
			fruits();
			break;
		case "banana":
			System.out.println("banana");
			 quantity=scan.nextInt();
			 amount=priceofbanana*quantity;
			System.out.println("rs."+amount);
			fruittax(priceofbanana,amount);
			fruits();
			break;
		case "grapes":
			System.out.println("grapes");
			 quantity=scan.nextInt();
			 amount=priceofgrapes*quantity;
			System.out.println("rs."+amount);
			fruittax(priceofgrapes,amount);
			fruits();
			break;
			
	    case "CONTINUE":
			  fruits();
			    	
		case "EXIT":
			 String[] args = {};
			 main(args);
			 
		
	//	default:
		//	System.out.println("plese enter the valid input");
		}
		}
		else {
		System.out.println("plese enter the valid input");
		}
		
	}
 //main method
	public static void main(String[] args) {
		marketbilling  obj =new marketbilling ();
		Scanner scan=new Scanner(System.in);
		System.out.println("select categories\n" + "0.vegetables\n" + "1.fruits\n"+ "2.EXIT");
		int select = scan.nextInt();
		
		if(select==0) {
			//call the method vegetables 
			obj.vegetables();
			
		}
		if(select==1) {
			//call the method fruits
			obj.fruits();
			
		}
		if(select==2) {
		    float total=obj.sum;
		System.out.println("Total Amount="+sum);
		   	System.out.println("Thank you for visiting");
		}
		
		
		

	}

}