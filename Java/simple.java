import java.util.Scanner;
class simple{
    int [] arr=new int[5];
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("The elements are:");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args)
    {
        simple obj=new simple();
        obj.read();
    }
}