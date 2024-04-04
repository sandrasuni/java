import java.util.Scanner;
class InvalidUserException extends Exception
{
public InvalidUserException(String msg)
{
super(msg);
}
}
public class Authentication
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter user name :");
String username=sc.nextLine();
System.out.println("Enter password :");
String password=sc.nextLine();
try
{
if(username.length()<8)

throw new InvalidUserException("Invalid username,username must be greater than 7 characters !");
else if(!password.equals("sandra123"))
{
throw new InvalidUserException("Incorrect password,Enter correct password!");
}
else
{
System.out.println("Login successful");
}
}
catch(InvalidUserException e)
{
e.printStackTrace();
}
}
}
