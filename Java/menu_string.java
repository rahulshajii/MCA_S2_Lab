import java.util.Scanner; 
class menu_string {  
    Scanner sc=new Scanner(System.in);
    String [] str;
    int n;
    //read
    void read()
    {
     System.out.println("Enter the Limit:");
     n=sc.nextInt();
     str=new String [n];
     System.out.println("Enter String Elements:");
     for (int i=0;i<n;i++)
    {
    str [i]=sc.next();
    }
    }
    //search
    void search(){
    int pos=1;
    System.out.println("Enter the element to be search:");
    String search=sc.next();
        int flag=0;
        
        for (int i=0;i<n;i++)
        {
            if(str[i].equals(search)){
            flag=1;
            pos=pos+i;
            break;
        }                                         
    }
        if (flag==1){
         System.out.println(" word " + search + " found at position "+pos);
        }
        else{
            System.out.println(" Not found !!!");
        }
    }
//to upper case
void uppercase(){
    System.out.println("enter the string:");
    String s8=sc.next();
        System.out.println(s8.toUpperCase());
    } 
//to lower case
void lowercase(){
    System.out.println("enter the string:");
    String s7=sc.next();
        System.out.println(s7.toLowerCase());
    } 
//length
void length() {
    System.out.println(" enter the string:");
    String s3=sc.next();
    System.out.println(s3.length());
 } 
//concatiante
void con(){
    System.out.println(" enter the first string:");
    String s1=sc.next();
    System.out.println(" enter the second string:");
    String s2=sc.next();
    System.out.println("output:"+s1.concat(s2));  
}
//main function
public static void main(String [] args) 
{ 
menu_string obj=new menu_string();
Scanner sc=new Scanner(System.in);
while(true){
   int ch;
    System.out.println("***********************");
    System.out.println("Menu Driven");
    System.out.println("1.String Read:");
    System.out.println("2.Search for String:");
    System.out.println("3.to upper Case:");
    System.out.println("4.to Lowercase:"); 
    System.out.println("5.Length of the string:"); 
    System.out.println("6.String Concatnate:");
    System.out.println("7.Exit");
    System.out.println("Enter your choice:"); 
    ch=sc.nextInt();
    switch(ch){
        case 1:obj.read();
               break;
        case 2:obj.search();
               break;
        case 3:obj.uppercase();
               break;
        case 4:obj.lowercase();
               break;
        case 5:obj.length();
               break;
        case 6:obj.con();
              break;
        case 7:System.exit(0);
              break;
        default:System.out.println("invalid!!");
              break;
    }
}
}
}

