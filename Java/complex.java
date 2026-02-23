import java.util.Scanner;
class complex{
    int real;
    int imag;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part:");
        real=sc.nextInt();
        System.out.println("Enter the imaginary part:");
        imag=sc.nextInt();
    }
    void display(int real_sum,int imag_sum)
    {
        System.out.println("The sum of two complex numbers is: "+real_sum+"+"+imag_sum+"i");
    }

    public static void main(String[] args)
    {
        complex c1=new complex();
        complex c2=new complex();
        c1.read();
        c2.read();
        int real_sum=c1.real+c2.real;
        int imag_sum=c1.imag+c2.imag;
        c1.display(real_sum,imag_sum);       
    }
}