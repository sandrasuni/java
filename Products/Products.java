import java.util.Scanner;
class Product{
int pCode,price;
String pName;
Product(int pCode,String pName,int price){
this.pCode=pCode;
this.pName=pName;
this.price=price;
}
}

class Products{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter product code:");
int pCode=sc.nextInt();
System.out.print("Enter product Name:");
String pName=sc.next();
System.out.print("Enter product Price:");
int price=sc.nextInt();
Product[] ps=new Product[3];
ps[0]=new Product(pCode,pName,price);
ps[1]=new Product(134,"Notebook",10);
ps[2]=new Product(143,"CardBoard",13);
int minPrice=ps[0].price;
System.out.print("=========================\n");
System.out.print("Code\tProduct Name\tPrice\n");
System.out.print("----\t-----------\t-----\n");

for(Product p:ps){
System.out.println(p.pCode + "\t" + p.pName +"\t" + p.price);
if(minPrice>p.price){
minPrice=p.price;
}
}

System.out.print("=================\n");
System.out.print("********************\n");
System.out.print("LOWEST COST PRODUCT\n");
System.out.print("----------------\n");
System.out.print("Code\tProduct Name\tPrice\n");
System.out.print("----\t---------\t-----\n");

for(Product p:ps){
if(minPrice==p.price){
System.out.println(p.pCode + "\t" + p.pName +"\t" + p.price);
}
}
System.out.print("\n*****************");
}
}
