import java.util.*;

class Subject 
{
    int subjectmarks, credits, grade;
}

class Student 
{
    String name, usn;
    double SGPA;
    Subject[] subject;
    Scanner s;

    Student() 
	{
        subject = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
        s = new Scanner(System.in);
    }

    void getdetails()
 {
        System.out.println("Enter USN:");
        usn = s.nextLine();
        System.out.println("Enter Name:");
        name = s.nextLine();
        System.out.println("Enter subject marks and credits");
        for (int i = 0; i < 8; i++) 
	{
            System.out.println("Enter credits for subject " + (i + 1) + ":");
            subject[i].credits = s.nextInt();
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            subject[i].subjectmarks = s.nextInt();
        }
    }

    double compute()
 {
        double totalcredits = 0, totalgradepoints = 0;
        for (int i = 0; i < 8; i++) 
	{
            totalcredits += subject[i].credits;
            totalgradepoints += (subject[i].subjectmarks / 10) * subject[i].credits;
        }
        return (totalgradepoints / totalcredits);
    }

    void display() 
  {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("marks and credits:");
        for (int i = 0; i < 8; i++)
	 {
            System.out.println("Subject " + (i + 1) + ": Marks - " + subject[i].subjectmarks + ", Credits - " + subject[i].credits);
        }
        System.out.println("SGPA: " + compute());
    }

    public static void main(String[] args)
  {
	int n;
	System.out.println("enter the number of students");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
        Student[] std = new Student[2];
        for (int i = 0; i < n; i++)
	 {
            std[i] = new Student();
        }
        for (int i = 0; i < n; i++) 
	{
            std[i].getdetails();
            std[i].display();
        }
	System.out.println("LIKITH.TARAKARAM");
	System.out.println("1BM23CS171");
    }
}
