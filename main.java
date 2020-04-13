import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Code ( eg: AA000000 ) : ");
        String userInput=sc.next();
        char first= (char) userInput.charAt(0);
        char second= (char) userInput.charAt(1);
        int num= Integer.parseInt(userInput.substring(2,8));

        num++;
        if(num>999999){
            if(second=='Z') first += 1;

            else second += 1;

            num=0;
        }

        System.out.print("Next Code : ");
        System.out.print(first);
        System.out.print(second);
        System.out.print(String.format("%06d",num));
    }
}

