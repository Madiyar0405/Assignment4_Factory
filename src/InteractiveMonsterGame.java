import java.util.Scanner;

public class InteractiveMonsterGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание фабрик
        MonsterFactory fantasyFactory = new FantasyMonsterFactory();
        MonsterFactory horrorFactory = new HorrorMonsterFactory();

        System.out.println("Welcome to the Interactive Monster Game!");
        System.out.println("Choose your factory: [1] Fantasy Factory [2] Horror Factory");
        int factoryChoice = scanner.nextInt();

        MonsterFactory chosenFactory = (factoryChoice == 1) ? fantasyFactory : horrorFactory;

        System.out.println("Choose your monster: [1] Goblin [2] Dragon [3] Zombie");
        int monsterChoice = scanner.nextInt();
        Monster playerMonster = null;

        switch (monsterChoice) {
            case 1:
                playerMonster = chosenFactory.createGoblin();
                break;
            case 2:
                playerMonster = chosenFactory.createDragon();
                break;
            case 3:
                playerMonster = chosenFactory.createZombie();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        System.out.println("You have chosen a " + playerMonster.name + "!");

        while (playerMonster.health > 0) {
            System.out.println("What would you like to do?");
            System.out.println("[1] Attack [2] Exit");
            int action = scanner.nextInt();

            if (action == 1) {
                playerMonster.attack();
                playerMonster.takeDamage(10); // Пример урона от атаки монстра
            } else if (action == 2) {
                System.out.println("You have decided to exit the game.");
                break;
            }
        }

        System.out.println("Game over!");
    }
}