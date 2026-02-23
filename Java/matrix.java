import java.util.Scanner;
class matrix{
    int n,m;
    int [][] m1;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter the number raw:");
        n=sc.nextInt();
        System.out.println("Enter the number of  colum:");
        m=sc.nextInt();
        m1=new int[n][m];
        System.out.println("Enter the elemenets:");
         for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){  
            m1[i][j]=sc.nextInt();
            }
         }
    }
    public static void main(String[] args)
    {
        matrix obj=new matrix();
        matrix obj1=new matrix();
        obj.read();
        obj1.read();
        int n= obj.n;
        int m=obj.m;
        int [][] result=new int [n][m];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            { 
                result[i][j]=obj.m1[i][j]+obj1.m1[i][j];
            }
        }
         System.out.println("*******the final matrix******");
        
    for (int i=0;i<n;i++)
    {
            for(int j=0;j<m;j++)
            { 
                System.out.print(result[i][j] +" ");
            }
     System.out.println(); 
    }
        }
}


