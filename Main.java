//Sample Repo
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        //ssamp
        System.out.println("Please Enter a Num: ");
        int num = userInput.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}