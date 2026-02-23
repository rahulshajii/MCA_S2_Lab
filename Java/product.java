//define a class class product, member pcode,pname,price,
//create  three object of the class and find the product having the lowest price
import java.util.Scanner;
public class product{
    int pcode;
    String pname;
    int price;
    Scanner sc=new Scanner(System.in);
    void pro(){
        System.out.println("Enter the product code:");  
        pcode=sc.nextInt();
        System.out.println("Enter the product name:");
        pname=sc.next();
        System.out.println("Enter the product price:");
        price=sc.nextInt();
        }
    public static void main(String[] args){
        
         product p1=new product();
         p1.pro();
         product p2=new product();      
         p2.pro(); 
         product p3=new product();
         p3.pro();
        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println("the lowest price is "+p1.price);
        }
        else if(p2.price<p1.price && p2.price<p3.price){
            System.out.println("the lowest price is "+p2.price);
        }
        else{
            System.out.println("the lowest price is "+p3.price);
        }
    }
}