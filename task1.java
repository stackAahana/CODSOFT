import java.util.*;
class task1//student grade calculator
{
    public static void main(String args[])
    {
        int sub,marks,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of subjects");
        sub=sc.nextInt();
        System.out.println("enter the marks for each subject out of 100");
        for( int i=0;i<sub;i++)
         {
           marks=sc.nextInt();
           s=s+marks;
         }
      System.out.println("Total Marks="+s);    
     int avg = s/sub;
     System.out.println("Average Percentage="+avg);
     if(avg>90 && avg<=100)
        System.out.println("Grade=O");
        else if(avg>80 && avg<=90)
        System.out.println("Grade=E");
        else if(avg>70 && avg<=80)
        System.out.println("Grade=A");
        else if(avg>60 && avg<=70)
        System.out.println("Grade=B");
        else
        System.out.println("Grade=C");
}
}