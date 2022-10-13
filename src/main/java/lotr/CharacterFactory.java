package lotr;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;

import static game.GameManager.rand;
import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {

//    public Class[] class_array = { Knight.class, King.class, Elf.class, Hobbit.class};
//    private int size = class_array.length;
//    public Character createCharacter() {
//        return new class_array[rand.nextInt(size)]();
//    }
public Character createCharacter() {
        int rand_num = rand.nextInt(4);
        switch (rand_num){
            case 0:
                return new Hobbit();

            case 1:
                return new Elf();

            case 2:
                return new Knight();

            case 3:
                return new King();

        }
        return new King();
    }
}
