import java.util.HashMap;
import java.util.Scanner;

public class menu {
    public static void mainMenu(HashMap <Integer, String> map){
        System.out.println(" 1 новое животное \n 2 найти информацию о животном \n 3 обучить новым командам \n 0 выход");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);

        switch (Integer.parseInt(s)) {
            case  (1):
                newAnimal.addAnimal(map);
                break;
            case (2):
                animalInfo.findAnimal(map);
               break;
            case (3):
                newCommands.addCommands(map);
                break;
            case (0):
                System.exit(0);
            default:
                mainMenu(map);
                break;
        }
        mainMenu(map);
    }
}
