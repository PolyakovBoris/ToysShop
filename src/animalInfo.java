import java.util.HashMap;
import java.util.Scanner;

public class animalInfo {
    public static int findAnimal(HashMap<Integer, String> map){
        System.out.println("введите кличку животного :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int key = -1;
        for (int i = 0; i < map.size(); i++){
            String findName = map.get(i);
            if (findName.contains(name)){
                System.out.println(map.get(i) + "\n");
                key = i;
            }
        }
        return key;

    }
}
