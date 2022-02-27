import java.util.Random;
import java.util.Scanner;

public class ZombieKillerArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attacker = random.nextInt(3);
        int surprise = random.nextInt(3);

        System.out.println("Welcome to zombie killer!");
        System.out.println("Please enter <next> to realise the next zombie or <stop> to stop the ZombieKiller\n");

        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
        String zombies[] = {"Close-Range Zombie", "Mid-Range Zombie", "Long-Range Zombie"};

        System.out.println("Types of Weapons: " + backpack[0] + " " + backpack[1] + " " + backpack[2]);
        System.out.println("Types of Zombies: " + zombies[0] + " " + zombies[1] + " " + zombies[2] + "\n");

        String command = "next";
        String attack = "";
        System.out.println("Enter desired waves for your run");
        int wavesDesired = Integer.parseInt(scanner.nextLine());
        int i = 1;
        boolean die = false;

            while (!command.equals("stop") || i <= wavesDesired) {
                if (command.equals("next")) {

                    switch (attacker) {

                        case 0:
                            System.out.println(zombies[0]);
                            break;
                        case 1:
                            System.out.println(zombies[1]);
                            break;
                        case 2:
                            System.out.println(zombies[2]);
                            break;
                    }
                    attack = scanner.nextLine();
                } else {
                    System.out.println("Invalid command. Please enter <next> to realise the next zombie or <stop> to stop the ZombieKiller");
                    command = scanner.nextLine();
                    continue;
                }
                if (surprise == 2) {
                    System.out.println("3 more zombies detected!!!");
                    attack = scanner.nextLine();
                    attack = scanner.nextLine();
                    attack = scanner.nextLine();
                }
                if (attack.equals("Shotgun") && attacker == 0) {
                    System.out.println("Good Job");
                    i++;

                    if (i > wavesDesired){
                        break;
                    }
                } else if (attack.equals("Assault Rifle") && attacker == 1) {
                    System.out.println("Good Job");
                    i++;
                    if (i > wavesDesired){
                        break;
                    }
                } else if (attack.equals("Sniper") && attacker == 2) {
                    System.out.println("Good Job");
                    i++;
                    if (i > wavesDesired){
                        break;
                    }
                } else {
                    System.out.println("Wrong weapon, you are dead!");
                    die = true;
                    break;
                }
                attacker = random.nextInt(3);
                command = scanner.nextLine();
                surprise = random.nextInt(3);
            }
            System.out.println("Waves ended");
            if (die == true){
                System.out.println("You didn't complete your challenge");
            }
            else {
                System.out.println("Congratulations, you have completed your challenge.\nReady for a new one?");
        }
    }
}