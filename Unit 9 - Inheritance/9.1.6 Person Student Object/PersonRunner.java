public class PersonRunner
{
    public static void main(String[] args)
    {
        Person edison = new Person("Thomas Edison", "February 11, 1847");
        Student einstein = new Student("Albert Einstein", "March 14, 1879", 12, 5.0);
        System.out.println(edison.getName());
        System.out.println(einstein.getName());
        System.out.println(edison.getBirthday());
        System.out.println(einstein.getBirthday());
        System.out.println(einstein.getGrade());
        System.out.println(einstein.getGpa());
    }
}