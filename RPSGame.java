
import java.util.Random;
import java.util.Scanner;


public class RPS_game
{

    public static void game(int user_choice)
    {
        
        Random rn = new Random();
        int gen_num = rn.nextInt(3);
        int com_choice = gen_num+1;

        if(com_choice==user_choice)
        {
            System.out.println("TIE");
        }
        else if(com_choice==1 && user_choice==2 || com_choice==2 && user_choice==3 ||  com_choice==3 && user_choice==1)
        {
            System.out.println("YOU WIN !!! ");
        }
        else
        {
            System.out.println("YOU LOSE !!! ");
        }
        
        if(com_choice==1)
        {
            System.out.println("ROCK");
        }
        else if(com_choice==2)
        {
            System.out.println("PAPER");
        }
        else
        {
            System.out.println("SCISSOR");
        }

        

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String str = "YES";
        do{
        
        System.out.println("Enter the choice :");
        System.out.println("1.ROCK");
        System.out.println("2.PAPER");
        System.out.println("3.SCISSOR");
        int user_choice = sc.nextInt();
        game(user_choice);
        System.out.println("Do you want to play again?(yes or no) ");
        String str1=sc.next();

        
        if(str1.equalsIgnoreCase(str))
        {
            continue;

        }
        else
        {
            break;
        }
        

        
        }while(true);
        
    }
}
    
        
    
