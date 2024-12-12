public class add{
public static void main(String args[])
{
if(args.length<2)
{
System.out.println("Provide atleast 2 numbers");
}
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[2]);
int sum=num1+num2;
System.out.println("Sum is" +sum);
}
}
