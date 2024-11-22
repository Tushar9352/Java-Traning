import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class IndianCoin {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,200,500};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = scanner.nextInt();
        int count=0;
        for(int i=coins.length-1;i>=0;i--){
            count+=amount/coins[i];
            amount=amount%coins[i];
        }
        System.out.println("Minimum number of coins required = "+count);
    }
}