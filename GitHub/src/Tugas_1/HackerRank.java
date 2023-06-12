package Tugas_1;

import java.util.*;

class Game{
    String name;
    double atk;
    double enemyHp;

    Game(){

    }

    Game (String name, double atk, double enemyHp){
        this.name = name;
        this.atk = atk;
        this.enemyHp = enemyHp;
    }

    double newEnemyHp(){
        double newEnemyHp =  enemyHp - atk;
        if (newEnemyHp < 0){
            newEnemyHp = 0;
        }
        return newEnemyHp;
    }

}
public class HackerRank {
    public static void main(String[] args) throws Exception {
        Scanner io = new Scanner(System.in);
        Game m1 = new Game();
        
        m1.name = io.nextLine();
        m1.atk = io.nextDouble();
        m1.enemyHp = io.nextDouble();

        System.out.printf("%s attacking enemy with attack power %.2f\n", m1.name,m1.atk);
        System.out.printf("Health of Enemy = %.2f", m1.newEnemyHp());
        
    }
}