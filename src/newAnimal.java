import java.util.HashMap;
import java.util.Scanner;
public class newAnimal {
    public static void addAnimal(HashMap <Integer, String> map){
        System.out.println("input class 1 - dog, 2 - cat: ");
        Scanner sc = new Scanner(System.in);
        String classOfAnimal = sc.nextLine();
        String s = "unknown";
        if (classOfAnimal.equals("1")){
            s = "dog, ";
        } else if (classOfAnimal.equals("2")) {
            s = "cat, ";
        }
        System.out.println("input name: ");
        s = s + sc.nextLine();
        System.out.println("input age: ");
        s = s + ", возраст " + sc.nextLine();
        System.out.println("input known commands: ");
        s = s + ", знает комманды - " + sc.nextLine();
        System.out.println(s);
        System.out.println(map.size());
        int nextNumInMap = map.size();
        map.put(nextNumInMap, s);
        System.out.println(map);
    }
}
