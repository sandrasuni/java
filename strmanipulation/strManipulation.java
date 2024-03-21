import java.util.*;
    import java.util.Scanner;
    class strManipulation
    {
    public static void main(String[]args)
    {
    System.out.print("CREATE NEW STRING USING NEW");
     System.out.print("\n\n ---------------------------");
    char chs[]={'l','i','v','e',' ','w','i','t','h','o','u','t',' ','f','e','a','r'};
    String newstr=new String(chs);
    System.out.print("\n\nNew String from char[] using new :"+newstr);
    byte asciis[]={65,66,67,68,69,70};
    String newstr2=new String(asciis);
    System.out.print("\n\nNew string of corresponding ascii value from asciis[] using new :"+newstr2);
    String s1="good";
    String s2="MORNING";
    System.out.print("\n\nstring 1 :"+s1);
    System.out.print("\nstring 2 :"+s2);
    System.out.print("\n\nlength of string 'good' :"+s1.length());
    System.out.print("\n\n"+s1+" to uppercase :"+s1.toUpperCase());
    System.out.print("\n\n"+s2+" to lowercase :"+s2.toLowerCase());
    
    //concatination
    
    System.out.print("\n\n CONCATENATION");
    System.out.print("\n\n -------------");
    System.out.print("\n\n using concat() :"+s1.concat(" "+s2));
    System.out.print("\n\n using '+' operator :"+s1+" "+s2);
    
    //character extraction
    
    System.out.print("\n\n CHARACTER EXTRACTION");
    System.out.print("\n\n --------------------");
    System.out.print("\n\ncharacter at 3rd position :"+s1.charAt(3));
    char c[]=new char[50];
    s1.getChars(2,4,c,0);
    System.out.print("\n\ncharcater between 2 and 4 :"+new String(c));
    
    //character comparison
    
    System.out.print("\n\n CHARACTER COMPARISON");
    System.out.print("\n\n --------------------");
    String x="welcome";
    String y="WELCOME";
    System.out.print("\n\nstring 1 :"+x);
    System.out.print("\nstring 2 :"+y);
    System.out.print("\n\n"+x+" equals "+y+" :"+x.equals(y));
    System.out.print("\n\n"+x+" equals IgnoreCase "+y+" :"+x.equalsIgnoreCase(y));
    System.out.print("\n\n"+x+" compare to "+y+" :"+x.compareTo(y));
    System.out.print("\n\n"+x+" starts with w  :"+x.startsWith("w"));
    
    //SUBSTRINGS
    System.out.print("\n\n SEARCH SUBSTRINGS");
    System.out.print("\n\n -----------------");
    String z="someone told me,You have attractive eyes";
    System.out.print("\n\n string  :"+z);
    System.out.print("\n\n index of 'attractive' word  :"+z.indexOf("attractive"));
    System.out.print("\n\n substring :"+z.substring(16));
    
    //string modification
    System.out.print("\n\n STRING MODIFICATION");
    System.out.print("\n\n -------------------");
    System.out.print("\n\n replace 'eyes' to 'smile' :"+z.replace("eyes","smile"));
    System.out.print("\n\n ------USING VALUE OF------");
    float n=35.87f;
    System.out.print("\n\n"+n+" is converted to string "+String.valueOf(n));
    }
    }
