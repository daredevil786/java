class Parent 
{ 
    void show() { System.out.println("number of patient()"); } 
} 
  
 
class Child extends Parent 
{ 
   
    @Override
    void show() { System.out.println("Dr name()"); }
    void show() { System.out.println("Departmant()"); } 
} 
  

class hos 
{ 
    public static void main(String[] args) 
    { 
          
            Parent obj1 = new Parent(); 
            obj1.show(); 
            parent obj2 = new Child(); 
            obj2.show(); 
            Parent obj3 = new Parent(); 
            obj1.show(); 
         
       
    } 
} 
