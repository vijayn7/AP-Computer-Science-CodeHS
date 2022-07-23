public class Dog
{
    private String name;
    
     public Dog(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public String speak(){
       return "Bark!";
   }
   
   public String toString(){
       return name + " likes to " + speak();
   }
}