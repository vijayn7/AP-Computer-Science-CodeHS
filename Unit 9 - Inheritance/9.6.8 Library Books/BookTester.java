import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();
        
        Book one = new TextBook("English", "Jeffrey D.", "Honors", "3");
        Book two = new TextBook("Math", "Sally M.", "Honors", "1");
        Book three = new TextBook("Chemistry", "Steven K.", "AP", "7");
        Book uno = new Novel("Harry Potter", "JK Rowling", "Fiction", 823);
        Book dos = new Novel("Tom & Jerry", "Fred Quinby", "Fiction", 35);
        Book tres = new Novel("Dr. Seuss", "Theodor S.", "Fiction", 22);
        
        library.add(one);
        library.add(two);
        library.add(three);
        library.add(uno);
        library.add(dos);
        library.add(tres);
        
        for(int i = 0; i < 6; i++) {
                System.out.println(library);
                System.out.println(library.get(i));
        }
    }
}