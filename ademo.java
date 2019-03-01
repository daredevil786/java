interface pet
{
   void eat();
   void play();
}
interface animal
{
   void sleep();
}
class dog implements pet, animal
{
   public void eat()
  {
     System.out.println("dog is eating");
  }
  public void play()
  {
   System.out.println("dog is running");
  }
public void sleep()
  {
   System.out.println("dog is sleeping");
  }
}
class ademo
{
   public static void main(String args[])
  {
     dog d= new dog();
     d.eat();
     d.play();
     d.sleep();
  }
}

