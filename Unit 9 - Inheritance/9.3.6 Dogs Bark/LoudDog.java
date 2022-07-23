public class LoudDog extends Dog
{
   
   public LoudDog(String name){
       super(name);
   }
   
   // Override the speak method here
   @Override
   public String speak(){
       return "BARK!";
   }
   
   //Override the toString here.
   //Remember, you can access the name using super.getName()
   @Override
   public String toString() {
       return super.getName() + " is loud and likes to " + speak();
   }
}