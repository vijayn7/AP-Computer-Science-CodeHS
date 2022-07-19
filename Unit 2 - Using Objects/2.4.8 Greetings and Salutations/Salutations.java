public class Salutations
{
    // Put your code here
    private String name;
    public Salutations(String yourName){
    name = yourName;
    }
    public void addressLetter(){
        System.out.println("Dear "+name);
    }
        public void signLetter(){
        System.out.println("Sincerely,");
        System.out.println(name);
    }
        public void signMemo(){
        System.out.println("Best,");
        System.out.println(name);
    }
        public void addressMemo(){
            System.out.println("To whom it may concern");
        }
}