import java.util.Scanner;
class string{
Scanner sc=new Scanner(System.in);
    void compare(int n){
    String [] str=new String [n];
    System.out.println("Enter String Elements:");
    //read
    for (int i=0;i<n;i++)
    {
    str [i]=sc.next();
    }
    //compare
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                   String temp=str[j];
                   str[j]=str[i];
                   str[i]=temp;
                }
            }
        }
        //display

        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }    
}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Limit:");
int a=sc.nextInt();
string obj=new string();
obj.compare(a);

}
}