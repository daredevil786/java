class Parent 
{ 
    void show() { System.out.println("Parent's show()"); } 
} 
  
 
class Child extends Parent 
{ 
   
    @Override
    void show() { System.out.println("Child's show()"); } 
} 
  

class main 
{ 
    public static void main(String[] args) 
    { 
         
         
           Child obj2 = new Child(); 
            obj2.show(); 
  
        
       
    } 
} 
