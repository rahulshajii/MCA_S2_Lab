import java.util.Scanner;
class search{
String [] str;
Scanner sc=new Scanner(System.in);
int x,pos;
void read(int n){
     x=n;
    str=new String [n];
    System.out.println("Enter String Elements:");
    for (int i=0;i<x;i++)
    {
    str [i]=sc.next();
    }
    }
    void search(String s){
        String search =s;
        int flag=0;
        
        for (int i=0;i<x;i++)
        {
            if(str[i].equals(search)){
            flag=1;
            pos=i;
            break;
        }                                         
    }
        if (flag==1){
         System.out.println(" word " + search + " found at postion " + (pos+1));
        }
        else{
            System.out.println(" Not found !!!");
        }
}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
search obj=new search();
System.out.println("Enter the Limit:");
int a=sc.nextInt();
obj.read(a);
System.out.println("Enter the element to be search:");
String s=sc.next();
obj.search(s);

}
}