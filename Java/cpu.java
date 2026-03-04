import java.util.Scanner;
class cpu{
    int price;
   // Scanner sc=new Scanner(System.in);
    class processor{
        int no_of_cores;
        String manufacturer;
        void read()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter processor details:");
            System.out.println("Enter price:");
            price=sc.nextInt();
            System.out.println("Enter the number of cores:");
            no_of_cores=sc.nextInt();
            System.out.println("Enter the manufacturer name:");
            manufacturer=sc.next();
            System.out.println("*******************************");
        }
       void display(){
        System.out.println("processor details");
        System.out.println("price:"+price);
        System.out.println("number of  cores:"+no_of_cores);
        System.out.println("manufacturer name:"+manufacturer);
        System.out.println("****************************");

       }
    }
    static class ram{
        String memmory,manufacturer;
        void read()
        { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter RAM details:");
            System.out.println("Enter memmory:");
            memmory=sc.next();
            System.out.println("Manufactuerer:");
            manufacturer=sc.next();
            System.out.println("**************************");

        }

        void display(){
        System.out.println("RAM details");
        System.out.println("mommory:"+memmory);
        System.out.println("manufacturer name:"+manufacturer);
        System.out.println("*********************");

        }
    }
    public static void main(String[] args)
    {
        cpu c1=new cpu();
        cpu.processor p=c1.new processor();
        cpu.ram r=new cpu.ram();
        p.read();
        r.read();
        p.display();
        r.display();
    }
}