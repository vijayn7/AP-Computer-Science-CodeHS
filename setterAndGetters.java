import java.util.ArrayList;
import java.util.Scanner;

public class setterAndGetters {
    public static void main(String[] args) {
        ArrayList<String> methods = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter variable name ('exit' to quit): ");
            String name = sc.next();
            if (name.equals("exit")) {
                break;
            }
            System.out.print("Enter variable Type: ");
            String type = sc.next();
            String setter = "public void set" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length()) + "(" + type + " " + name + ") {\n    this." + name + " = " + name + ";\n}";
            String getter = "public " + type + " get" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length()) + "() {\n    return " + name + ";\n}";
            methods.add(setter);
            methods.add(getter);
        }
        
        System.out.println();
        for (String method : methods) {
            System.out.println(method);
            System.out.println();
        }
    }
    
}
