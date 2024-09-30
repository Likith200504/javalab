import java.util.*;
class Quadratic
{
    int a,b,c;
    double r1,r2,d;
    void getd()
    {
        System.out.println("enter three values:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a==0)
        {
            System.out.println("enter non zero value of a");
            a=s.nextInt();
        }
        b=s.nextInt();
        c=s.nextInt();
    }
    void compute()
    {
        d=b*b-4*a*c;
        if(d==0)
        {
            r1=(-b)/(2*a);
            r2=r1;
            System.out.println("roots are"+r1+"and"+r2);
        }
        else if(d>0)
        {
            r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
            r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
            System.out.println("roots are"+r1+"and"+r2);
        }
        else
        {
            System.out.println("quadratic equation has imaginary roots:");
        }
    }
}
class QuadraticEquation
{
    public static void main(String args[])
    {
        Quadratic q=new Quadratic();
        q.getd();
        q.compute();
        System.out.println("Likith.Tarakaram");
        System.out.println("1BM23CS171");
    }
}
