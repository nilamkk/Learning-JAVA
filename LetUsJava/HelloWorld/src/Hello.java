import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int cnt=0;

        int sum=0;
        while(cnt<5){

            System.out.println("Enter the "+cnt+" th number:");
            boolean isValid= scanner.hasNextInt();
            if(isValid){
                int num= scanner.nextInt();
                sum+=num;
                cnt++;
            }else{
                System.out.println("Invalid input!!!");
            }
            scanner.nextLine();
        }

        System.out.println(sum);
        scanner.close();
    }

}
