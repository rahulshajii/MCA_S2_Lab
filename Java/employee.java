import java.util.Scanner;
class employee{
    int eNo;
    String eName;
    Float eSalary;
void read(Scanner sc){
  System.out.println("Enter the Employee number:");
  eNo = sc.nextInt();
  System.out.println("Enter the Employee Name:");
  eName=sc.next();
  System.out.println("Enter the Employee Salary:");
  eSalary=sc.nextFloat();
}
public static void main(String[] args){
    int n,s,temp=0;
    int flag=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Limit of Employees:");
    n=sc.nextInt();
    employee[] obj=new employee[n];
    for (int i=0;i<n;i++){
        obj[i]=new employee();
        obj[i].read(sc);
    }
   System.out.println("Enter the Employee number to search:");
   s =sc.nextInt();
   for(int i=0;i<n;i++){
    if (obj[i].eNo==s)
    {
        flag=1;
        temp=i;
        break;
    }
   }
    if(flag==1){
    System.out.println("Employee FOUND!!");
    System.out.println("Employee Number:"+obj[temp].eNo);
    System.out.println("Employee Name:"+obj[temp].eName);
    System.out.println("Employee Salary:"+obj[temp].eSalary);
   }
   else{
    System.out.println("NOT FOUND!!");
   }
}
}