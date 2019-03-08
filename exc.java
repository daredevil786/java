import java.util.*;
class Customexception extends Exception
{
  Customexception()
  {
   System.out.println("THERE IS AN ERROR");
  }
}
class exc
{
 public static void main (String args[])
 { 
  Scanner b= new Scanner(System.in);
  System.out.println("enter the age");
  String a= b.next();
  System.out.println("enter the name");
  String d = b.next();
  try
    {
     if(a.equals("20")&&d.equals("ram"))
      System.out.println("authorizes access");
      else
      throw new Customexception();
    }
    catch (Exception e)
    {
     System.out.println("");
    }
 }
}

