import java.util.Scanner;

public class Shop {


    private Product productList[]= new Product[500];
    private Person owner;
    private String address;
    private static int productCount=0;

    private static double revenue;

    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        this.productList = new Product[100];
    }



    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCount++]=product;
        System.out.println("Product added");


    }

    public void sale(){
        System.out.println("Sale Menu");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        String id= scanner.nextLine();

        for(int i=0; i<productCount; i++){

            if(productList[i].getId().equals(id))
            {
                productList[i].setQuantity(productList[i].getQuantity()-1);
                revenue+=productList[i].getPrice();
                System.out.println("Sale successful");
            }
            else{
                System.out.println("Product not found");
            }

        }


    }

public void display(){
System.out.println("Display Menu");
 Scanner scanner = new Scanner(System.in);

  System.out.print("Enter product ID: ");
   String id= scanner.nextLine();
for(int i=0;i<productCount;i++){
if(productList[i].getId().equals(id))
{

System.out.println(productList[i].getName());
System.out.println(productList[i].getPrice());
System.out.println("Display Successfull");
}
else 
{
System.out.println("Error in display");
}

}


}


public void modify(){

System.out.println("Modify the name and price ");
 Scanner scanner = new Scanner(System.in);

  System.out.print("Enter product ID: ");
   String id= scanner.nextLine();
for(int i=0;i<productCount;i++){
if(productList[i].getId().equals(id))
{
System.out.println(" modified name of product:");

 String name1 = scanner.nextLine();
productList[i].setName(name1);
System.out.println(" modified price of product:");
 
 double price1 = scanner.nextDouble();
productList[i].setPrice(price1);

System.out.println(productList[i].getName());

System.out.println(productList[i].getPrice());





System.out.println("modified successfully");
}
else
{


System.out.println("Error in Modification");

}
}


}

public void delete(){

System.out.println("delete product");
 Scanner scanner = new Scanner(System.in);

  System.out.print("Enter product ID: ");
   String id= scanner.nextLine();
for(int i=0;i<productCount;i++){
if(productList[i].getId().equals(id))
{
System.out.println("removing the product with this id "+ productList[i].getId());
productList[i]=null;
System.out.println("Product deleted successfully");
}
else
{
System.out.println("not deleted");
}

}

}

}




