import java.util.Scanner; 
class p117
 { 
      public static void main(String[] args) 
      { 
    
        Scanner sc =new Scanner(System.in);
        int arr[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int totalAmount;
 
        System.out.print("Enter total amount  =  ");
        totalAmount=sc.nextInt();
 
        int temp = totalAmount;
  
        for(int i = 0; i < 9; i++)
        {
            System.out.println("Number of "+arr[i]+" notes = "+temp / arr[i]);
             temp = temp % arr[i];
        }
          
      } 
 }