import org.apache.commons.lang3.ArrayUtils;
public class Main {
    public static void main(String[] args) {

        Monster.buildBattleBoard();

        Monster[] Monsters = new Monster[4];

        Monsters[0] = new Monster(1000, 20, 1, "Vampire");
        Monsters[1] = new Monster(500, 40, 2, "Slime");
        Monsters[2] = new Monster(1000, 20, 1, "Skeleton");
        Monsters[3] = new Monster(1000, 20, 1, "Zombie");

        Monster.redrawBoard();

        for(Monster m : Monsters){
            if(m.isAlive()){
                int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
                m.moveMonster(Monsters, arrayItemIndex);
                Monster.redrawBoard();
            }

        }

    }


}