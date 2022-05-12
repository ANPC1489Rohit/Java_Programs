import java.util.Scanner;

 public class Food_corner
 {

 
 		public static void main(String[] args)
 		{
 			int order, amount=0, sub_veg, sub_manu, sub_icecream, ans, Total, gst;
 			Scanner sc= new Scanner(System.in);
 			do{
 				System.out.println("What do you want to order:\n 1. Press 1 for Veg 2. Press 2 for Manu 3. Press 3 for Icecream");
 				order=sc.nextInt();
 				switch(order)
 				{
 					case 1:
 						System.out.println("Please enter your choice");
 						do{
 							System.out.println("Press 1 for Paneer Chilly:- Rs. 50\n Press 2 for Momo:- Rs. 100 \n Press 3 for Veg Crispy:- Rs. 110 \n Press 4 Spring Rolls:- Rs. 120");
 							sub_veg=sc.nextInt();
 							if(sub_veg==1)
 							{
 								System.out.println("Your Paneer Chilly will be served shortly");
 								amount=amount+90;
 							}
 							else if(sub_veg==2)
 							{
 								System.out.println("Your Momo will be served shortly");
 								amount=amount+100;
 							}
 							
 							System.out.println("Do you want to order anything more starter? \n 1. Press 1 for Yes \n 2. Press 2 for No");
 							ans=sc.nextInt();
 						}while(ans==1);
 						break;
 					case 2:
 						System.out.println("Please enter your choice");
 						do{
 							System.out.println("Press 1 for Rajma Chawal:- Rs. 130 \n Press 2 for Punjabi Thali:- Rs. 140 \n Press 3 for Biryani:- Rs. 150 \n Press 4 Chole Bhature:- Rs. 160");
 							sub_veg=sc.nextInt();
 							if(sub_veg==1)
 							{
 								System.out.println("Your Rajma Chawal will be served shortly");
 								amount=amount+130;
 							}
 							else if(sub_veg==2)
 							{
 								System.out.println("Your Punjabi Thali will be served shortly");
 								amount=amount+140;
 							}
 							
 							System.out.println("Do you want to order anything more in main course? \n 1. Press 1 for Yes \n 2. Press 2 for No");
 							ans=sc.nextInt();
 						}while(ans==1);
 						break;
 					case 3:
 						System.out.println("Please enter your choice");
 						do{
 							System.out.println("Press 1 for Ice Cream:- Rs. 170 \n Press 2 for Brownie:- Rs. 180 \n Press 3 for Waffle:- Rs. 190 \n Press 4 Gulab Jamun:- Rs. 200");
 							sub_veg=sc.nextInt();
 							if(sub_veg==1)
 							{
 								System.out.println("Your Ice Cream will be served shortly");
 								amount=amount+170;
 							}
 							else if(sub_veg==2)
 							{
 								System.out.println("Your Brownie will be served shortly");
 								amount=amount+180;
 							}
 							
 							System.out.println("Do you want to order anything more in main course? \n 1. Press 1 for Yes \n 2. Press 2 for No");
 							ans=sc.nextInt();
 						}while(ans==1);
 						break;	
 				}
 				System.out.println("Do you want to order anything more? \n 1.Press 1 for Yes \n Press 2 for No");
 				ans=sc.nextInt();
 			}while(ans==1);
 			gst=(amount/100)*18;
 			Total= amount+gst; 
 			System.out.println("Your Total bill is: "+Total);
 			System.out.println("Thank you for visiting");
 		}
 }
 	
 	
 	
 	


