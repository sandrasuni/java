import java.util.*;
interface Student
{
int score=70;
void displayScore();
}
interface Sports
{
int score=82;
void displaySportsScore();
}
 
class Result implements Student,Sports
{
public void displayScore()
{
System.out.println("Academic Score:"+Student.score);
}
public void displaySportsScore()
{
System.out.println("Sports Score:"+Sports.score);
}
}
class SportsStudent
{
public static void main(String[]args)
{
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}
}
