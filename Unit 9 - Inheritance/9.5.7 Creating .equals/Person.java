public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getName(){
        return name;
    }

    //Create a equals method here
    public boolean equals(Person other) {
        if (this.getName().equals(other.getName()) && this.getBirthday().equals(other.getBirthday())) {
            return true;
        }
        return false;
    }
    
}