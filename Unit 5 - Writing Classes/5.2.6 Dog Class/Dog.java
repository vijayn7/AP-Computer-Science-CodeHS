public class Dog
{
    private String name;
    private int age;
    private double weight;

    // Add your constructors here
    public Dog(String name, int age, double weight) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    
    public Dog(String name, int age) {
        this.name = name;
        this.weight = 0.0;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + "\nWeight: " + weight +  "\nAge: " + age;
    }
}