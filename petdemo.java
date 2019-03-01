interface pet
{
   void eat();
   void play();
}
class dog implements pet
{
   public void eat()
  {
     System.out.println("dog is eating");
  }
  public void play()
  {
   System.out.println("dog is running");
  }
}
class cat implements pet
{
   public void eat()
  {
    System.out.println("cat is eating");
  }
  public void play()
  {
   System.out.println("cat is running");
  }
}
class petdemo
{
   public static void main(String args[])
  {
     dog d= new dog();
     d.eat();
     d.play();
     cat c= new cat();
     c.eat();
     c.play();
  }
}
