import java.util.*;
class task3 //number game
{
    public static void main(String args[])
    {
        int guess,maxattempt=5,round=0,won=0;
        Scanner sc=new Scanner(System.in);
        int min=1;
        int max=100;
        System.out.println("enter the max number of rounds the user wants to play");
        int maxround=sc.nextInt();
        while(round<maxround)
        {
         int attempt=0,success=0;
         int a=(int)(Math.random()*(max-min+1)+min);
        System.out.println("Random number="+a);
        while(attempt<maxattempt && success<=0)
        {
        System.out.println("enter your guessed number");
        guess=sc.nextInt();
        attempt++;
        if(guess==a){
        System.out.println("guess is correct");
        success++;
        }
        else if(guess>a)
        System.out.println("guess is too high");
        else
        System.out.println("guess is too low");
    }
    System.out.println("No of attempts in this round="+attempt);
    round++;
    if(success>0)
    won++;
    }
    System.out.println("number of rounds won="+won);
}
} 