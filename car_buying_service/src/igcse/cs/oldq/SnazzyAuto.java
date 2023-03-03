package igcse.cs.oldq;

import java.util.*;

public class SnazzyAuto {

	public static void main(String[] args) {
		System.out.println(" Dear CUSTOMER, WELCOME From Snazzy Autos\n");
		System.out.println("Available Models: 1.Hatchback, 2.Saloon, 3.Estate\n");
		System.out.println("**The Price For Each Model**\n" + "1.Hatchback :: Rs 5.35 lakh\n"
				+ "2.Saloon    :: Rs 4.95 lakh\n" + "3.Estate    :: Rs 6.25 lakh\n");
		String[] models = new String[3];
		models[0] = "Hatchback";
		models[1] = "Saloon";
		models[2] = "Estate";
		System.out.println("Enter Your Selected Model: 1 OR 2 OR 3\n");
		Scanner sc = new Scanner(System.in);
		int selectedmodel = sc.nextInt();
		int changeindex = selectedmodel - 1;
		int price = 0;
		int o_price = 0;
		int add_price = 0;
		double loyal_price = 0.0;
		String i;
		int customer_price;
		if (changeindex == 0) {
			price = 535000;
		} else if (changeindex == 1) {
			price = 495000;

		} else if (changeindex == 2) {
			price = 625000;
		} else {
			System.out.println("Customer, There is Something wrong");
		}
		System.out.println("Dear Customer, Do you want to choose Optional extra");
		String[] extra = new String[5];
		extra[0] = "Set Of Luxury Seat";
		extra[1] = "Statellite navigation";
		extra[2] = "Parking sensors";
		extra[3] = "Bluetooth Connectivity";
		extra[4] = "Sound System";
		Scanner r = new Scanner(System.in);
		String reply = r.nextLine();
		if (reply.equals("Yes") || reply.equals("y") || reply.equals("Y")) {
			do {
				System.out.println("**Optional extra::**\n" + "1.Set Of Luxury Seat     :: RS 450000\n"
						+ "2.Statellite navigation  :: RS 5500\n" + "3.Parking sensors	 :: RS 10000\n"
						+ "4.Bluetooth Connectivity :: RS 350\n" + "5.Sound System		 :: RS 1000");

				System.out.println("Customer, Please Enter any options you want");
				Scanner ch = new Scanner(System.in);

				int choose = ch.nextInt();

				int rechoose = choose - 1;
				if (rechoose >= 0 || rechoose <= 4) {
					if (rechoose == 0) {
						o_price = 45000;
					}
					if (rechoose == 1) {
						o_price = 5500;

					}
					if (rechoose == 2) {
						o_price = 10000;
					}
					if (rechoose == 3) {
						o_price = 350;
					}
					if (rechoose == 4) {
						o_price = 1000;
					}
				}

				else {
					o_price = 0;
				}
				add_price += o_price;
				System.out.println("Dear Customer, Do you want to add more Options again");
				System.out.println("Enter Yes OR yes OR Y OR y");
				Scanner sure = new Scanner(System.in);
				i = sure.nextLine();
			} while (i.equals("yes") || i.equals("Yes") || i.equals("Y") || i.equals("y"));
		} else {
			System.out.println("No Options");
		}
		int no_tradeprice = price + add_price;
		System.out.println("Customer, Are You Loyal Customer and Do u have member card");
		Scanner l = new Scanner(System.in);
		String loyal = r.nextLine();
		if (loyal.equals("Yes") || loyal.equals("y") || loyal.equals("Y")) {
			loyal_price = no_tradeprice * 0.1;
			System.out.println("Before Trading old car There is 10% discount for Our loyal Customer/n"
					+ "Now Your Amount with discount is ::" + loyal_price);
		} else {
			loyal_price = no_tradeprice;
		}
		System.out.println("Customer, Do you want trade new car with old car\n" + "Please Enter Yes OR No");
		Scanner s = new Scanner(System.in);
		String answer = s.nextLine();
		if (answer.equals("Yes") || answer.equals("y") || answer.equals("Y")) {
			System.out.println("Snazzy Auto must give from Rs 10000 to 100000\n" + "Enter the amount");

			Scanner in = new Scanner(System.in);
			int giveprice = in.nextInt();
			if (giveprice >= 10000 || giveprice <= 100000) {
				customer_price = giveprice;
				System.out.println("The price of old car ::" + customer_price);
				System.out.println("Customer you must paid::" + (loyal_price - customer_price));
			} else {
				System.out.println("The Trading is no work");
			}
		} else {
			System.out.println("With 5% Discount::" + no_tradeprice * 0.05);

		}

	}

}
