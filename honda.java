interface vehile
{
   void start();
   void stop();
}
interface car
{
   void reverse();
}
class hond implements vehile, car
{
   public void start()
  {
     System.out.println("honda start");
  }
  public void stop()
  {
   System.out.println("honda stop");
  }
public void reverse()
  {
   System.out.println("honda reverse");
  }
}
class honda
{
   public static void main(String args[])
  {
     hond h= new hond();
     h.start();
     h.stop();
     h.reverse();
  }
}

