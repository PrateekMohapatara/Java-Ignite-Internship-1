/*
ADVANCED 2 – Mini Game Character System

Create a class GameCharacter:

Attributes:
name
health (PRIVATE)
attackPower (PRIVATE)
Requirements:
Constructor using this
Proper encapsulation
Methods:
attack(GameCharacter enemy)
heal()
showStats()
Rules:
attack reduces enemy health
heal increases own health
health should never be accessed directly
Twist:

Each attack should show:
*/
//X attacked Y and reduced health by Z
package Day5_prog;

import java.util.Scanner;

class GameCharacter {

    String name;
    private int health;
    private int attackPower;

    GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public int getHealth() {
        return health;
    }

    public void attack(GameCharacter enemy) {

        enemy.health -= attackPower;

        if(enemy.health < 0) {
            enemy.health = 0;
        }

        System.out.println(name + " attacked " + enemy.name +" and reduced health by " + attackPower);
    }

    public void heal() {

        health += 20;

        if(health > 100) {
            health = 100;
        }

        System.out.println(name + " healed 20 health.");
    }

    public void showStats() {
        System.out.println("\nName : " + name);
        System.out.println("Health : " + health);
        System.out.println("Attack Power : " + attackPower);
    }
}

public class minibattle_game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameCharacter you =
            new GameCharacter("Hero", 100, 15);

        GameCharacter enemy =
            new GameCharacter("Enemy", 100, 10);

        while(you.getHealth() > 0 &&
              enemy.getHealth() > 0) {

            System.out.println("\n===========");
            you.showStats();
            enemy.showStats();
            System.out.println("===========");

            System.out.println("1. Attack");
            System.out.println("2. Heal");

            System.out.print("Choice : ");
            int choice = sc.nextInt();

            switch(choice) {

            case 1:
                you.attack(enemy);

                if(enemy.getHealth() > 0) {
                    enemy.attack(you);
                }
                break;

            case 2:
                you.heal();

                if(enemy.getHealth() > 0) {
                    enemy.attack(you);
                }
                break;

            default:
                System.out.println("Invalid Choice");
            }
        }

        if(you.getHealth() > 0) {
            System.out.println("\nYou Win!");
        } else {
            System.out.println("\n Game Over!");
        }

        sc.close();
    }
}
