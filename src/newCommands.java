import java.util.HashMap;
import java.util.Scanner;

public class newCommands {
    public static void addCommands (HashMap <Integer, String> map){
        int key = animalInfo.findAnimal(map);
        System.out.println("input new commands: ");
        Scanner sc = new Scanner(System.in);
        String oldData = map.get(key);
        map.put(key, oldData + ", " + sc.nextLine());
        System.out.println(map.get(key));
    }
}
