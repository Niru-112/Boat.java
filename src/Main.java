import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;
  
    public Product(String name, double price, int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
    }
  
    public String getName() {
      return name;
    }
  
    public double getPrice() {
      return price;
    }
  
    public int getQuantity() {
      return quantity;
    }
  }
class ShopProduct
{
    public ShopProduct()
    {
    
    System.out.println("Welcome to boAt!" + "We are here to help you find the best that boAt has to offer."+ "What are you looking for today?");
    System.out.println("********************");
    System.out.println("Select Product you want to buy");
    System.out.println("********************");

    System.out.println("1)Wireless Headphones\n2)Smart Watches\n3)Accessories");
    boolean continueShopping = true;   
    do
    {
    System.out.println("Enter Your Choice: ");
    Scanner sc=new Scanner(System.in);
    int ch= sc.nextInt();
    switch(ch)
    {
        case 1:
        {
                System.out.println("You selected headphones. Let me show you our best sellers!\n1)On-ear headphones\n2)Over-ear Wireless Headphones");

                int a= sc.nextInt();
                switch(a)
                {
                    case 1: System.out.println("You selected wireless On-Ear headphones.!");
                    break;

                    case 2: System.out.println("You selected wireless Over-Ear headphones.!");
                    break;

                    default: System.out.println("Invalid choice");
                }
        }
        break;
    
        case 2:
        {
                System.out.println("You Selected Smart watches. Let me show our best sellers!\n1)Bluetooth Calling\n 2)Amoled Display\n 3)Voice Assistant\n 4)Activity Checker");
                
                int b=sc.nextInt();
                switch(b)
                {
                    case 1: System.out.println("You selected Bluetooth Calling.!");
                    break;
                    case 2: System.out.println("You selected Amoled Display.!");
                    break;
                    case 3: System.out.println("You selected Voice Assistant.!");
                    break;
                    case 4: System.out.println("You selected Activity Checker.!");
                    break;
                    default: System.out.println("Invalid choice");
                }
        }
        break;
        case 3:
        {
                System.out.println("You selected Accessories. Let me show our best sellers.\n 1)Mobile Cables\n 2)Car Chargers\n 3)Power Banks");
                
                int c=sc.nextInt();
                switch(c)
                {
                    case 1: System.out.println("You selected Mobile Cables.!");
                    break;
                    case 2: System.out.println("You selected Car Chargers .!");
                    break;
                    case 3: System.out.println("You selected Power Banks.!");
                    break;
                    default: System.out.println("Invalid choice");
                }
                
        }
            break;
            default: System.out.println("Invalid choice");
    
    }
        System.out.println("Do you want to continue?(Y/N)!!");
        String contShopping = sc.next();
            if (contShopping.equalsIgnoreCase("N")) {
                continueShopping = false;
            }
        } while (continueShopping);
        System.out.println("Thank You!!");
    }
}

class Service 
{
    public Service()
    {
    
       
        System.out.println("Welcome to boAt!"+
        "We are here to help you. Please let us know the topic of your query. "+
        " \n 1. Is the Query regarding Product Warranty? "+
        "\n 2. Is the Query regarding Product bought from boAt Website? "+
        " \n 3. Is your Product not working ?"+
        "\n 4. General Information "+
        "\n 5. Close Chat "+
         "Write a number between 1 to 5 to make your selection.");
    boolean continueService = true;
    do
        {
        System.out.println("Enter Your Choice: ");
        Scanner sc=new Scanner(System.in);
        int ch= sc.nextInt();
        
        switch(ch)
            {
            case 1: System.out.println("Please choose from below to proceed further."+
                "\n1. Track My Ticket"+
                "\n2. Invoice Download"+
                "\n3. How do I claim the Warranty?"+
                "\n4. Issue with Replaced Product"+
                "\n5. Service Centre Locator"+
                "\n6. Close Chat"+

                "\n write a number between 1-7 to make your selection.");
 
 
                int a= sc.nextInt();
                     switch(a)
                        {
                            case 1:System.out.println("TICKET ID:24132098722");
                            break;
                            case 2:System.out.println("Downloded");
                            break;
                            case 3:System.out.println("You have 1 year of warranty in total");
                            break;
                            case 4:System.out.println("No Replacement.");
                            break;
                            case 5: System.out.println(" Ahemdabad \n Rajkot \n Baroda");
                            break;
                            case 6: System.out.println("Exit");
                            break;
                            default :System.out.println("Inavlid choice");
                            break;
                        }
             break;           
 
 
 
            case 2: System.out.println("Please choose from below to proceed further"+

                "\n 1. Track My Order"+
                "\n 2. Invoice Download"+
                "\n 3. Product Replacement"+
                "\n 4. Issue with Delivered Product"+
                "\n 5. Order Cancellation"+
                "\n 6. Close Chat"+

                "\n Type a number between 1-7 to make your selection.");


                int b=sc.nextInt();
                    switch(b)
                        {
                            case 1:System.out.println("Your order will arrived in 2 days");
                            break;
                            case 2:System.out.println("Print Not Available");
                            break;
                            case 3:System.out.println("Product is not Replacable");
                            break;
                            case 4:System.out.println("If facing any issue with product plaese contact us via email");
                            break;
                            case 5:System.out.println("You can cancel your order by going in settings in BOAT app");
                            break;
                            case 6:System.out.println("Exit");
                            break;
                        }
             break;
  
            case 3:System.out.println("Please visit our official website and check for product working and functions");
            break;
  
            case 4:System.out.println("BoAt set sail in 2014 . \n During one of their many explorations, our founders Aman Gupta and Sameer Mehta discovered that the dopest people of our land were in search of affordable, durable and ultra fashionable audio products to groove to."+
                    "Read more at: https://www.boat-lifestyle.com/pages/who-are-we");
            break;

            case 5:System.out.println("Exit");
            break;

            default:System.out.println("Invalid choice");
            break;
  
            }
        System.out.println("Do you want to continue?(Y/N)!!");
        String contService = sc.next();
            if (contService.equalsIgnoreCase("N")) {
                continueService = false;
            }
        } while (continueService);
        System.out.println("Thank You!!");
    }
    
}

    




public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("\t\t\t\t^^^^^^^^^^^^Hey boAthead!^^^^^^^^^^^^^^\n \t\t\t\t!!! Welcome to boAt Lifestyle !!!\n" + "Explore the best headphones, earbuds, smartwatches, speakers, and more" +  " or get any query with respect to past purchases resolved within minutes.\n" +
        "Tell us what you need by selecting an option");
        
        System.out.println("1.ShopProduct\n2.Service\n3.Exit");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
                    ShopProduct sp = new ShopProduct();
                    break;

            case 2:
                    Service s = new Service();
                    break;
            case 3:
                    System.out.println("Exit");
                    break;
            default:
                    System.out.println("Invalid choice");
                    break;

        }

    }
}


