public class DogTester
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("name");
        LoudDog loudDog = new LoudDog("Name");
        
        System.out.println(dog);
        System.out.println(loudDog);
    }
}