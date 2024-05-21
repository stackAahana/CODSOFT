import java.util.*;
class student{
    String name;
    int roll;
    double grade;
    String number;
    student(String name,int roll,double grade,String number)
    {
        this.name=name;
        this.roll=roll;
        this.grade=grade;
        this.number=number;
    }
}
class studentmanagementsystem{
    void add(student newarr[],student students[],student a)
    {
        int m=newarr.length;
      for(int i=0;i<m;i++)
      {
        if(i!=(m-1))
       newarr[i]=students[i];
       else
        newarr[i]=a;
      }
      for(int i=0;i<m;i++)
      {
        System.out.println(newarr[i].name);
       System.out.println(newarr[i].roll);
       System.out.println(newarr[i].grade);
       System.out.println(newarr[i].number);
      }
    }
    void remove(student students[],int pos)
    {
       int m=students.length;
      for(int i=0;i<m-1;i++)
      {
        if(i==pos || i>pos)
        {
            students[i]=students[i+1];
        }
}
      for(int i=0;i<m-1;i++)
      {
        System.out.println(students[i].name);
       System.out.println(students[i].roll);
       System.out.println(students[i].grade);
       System.out.println(students[i].number);
    }
    }
    void search(student students[],student p)
    {
         int m=students.length;
      for(int i=0;i<m;i++)
      {
        if(students[i].name.equals(p.name) && students[i].roll==p.roll && students[i].grade==p.grade && students[i].number.equals(p.number))
        System.out.println("student found");
        else
        System.out.println("student not found");
         }
    }
    void display(student students[])
    {
       int m=students.length;
      for(int i=0;i<m;i++)
      {
        System.out.println(students[i].name);
       System.out.println(students[i].roll);
       System.out.println(students[i].grade);
       System.out.println(students[i].number);
      }
    }
   public static void main(String args[])
   {
    int n,roll,ch,pos;
    double grade;
    String name,number;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of students");
    n=sc.nextInt();
    student students[]=new student[n];
    for(int i=0;i<n;i++)
    {
       System.out.println("enter the details of student"+ (i + 1) + ":");
       System.out.println("enter name");
       name=sc.next();
       System.out.println("enter roll");
       roll=sc.nextInt();
       System.out.println("enter grade");
       grade=sc.nextDouble();
       System.out.println("enter number");
       number=sc.next();
       students[i]=new student(name,roll,grade,number);
    }
    studentmanagementsystem obj=new studentmanagementsystem();
   System.out.println("enter 1 for adding a student, 2 for removing a student, 3 for searching a particular student, 4 for displaying the list of students, 5 for exiting"); 
   System.out.println("enter your choice");
   ch=sc.nextInt();
   switch(ch)
   {
    case 1:System.out.println("enter the student to add");
            System.out.println("enter name");
          String  name1=sc.next();
           System.out.println("enter roll");
           int roll1=sc.nextInt();
           System.out.println("enter grade");
           double grade1=sc.nextDouble();
           System.out.println("enter number");
           String number1=sc.next();
           student a=new student(name1,roll1,grade1,number1);
           int c=students.length;
           student newarr[]=new student[c+1];
           obj.add(newarr,students,a);
           break;
    case 2:   System.out.println("enter the position to delete");
              pos=sc.nextInt();  
              obj.remove(students,pos);
              break;
    case 3: System.out.println("enter the student to search");
            System.out.println("enter name");
           String name2=sc.next();
           System.out.println("enter roll");
           int roll2=sc.nextInt();
           System.out.println("enter grade");
          double grade2=sc.nextDouble();
           System.out.println("enter number");
           String number2=sc.next();
           student p=new student(name2,roll2,grade2,number2);
           obj.search(students,p);
           break;
    case 4:obj.display(students);
           break;
    case 5: System.exit(0);
            break;
    default: System.out.println("Invalid choice");                                
   }
   }

}
