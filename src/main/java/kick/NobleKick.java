package kick;

import java.util.Random;
import lotr.Character;
import lotr.Noble;

import static game.GameManager.rand;

public class NobleKick extends BasicKick{

    NobleKick(Noble owner){
        super(owner);
    }
    public void hit(Character other){
        int hit_power = rand.nextInt(owner.getPower() + 1);
        other.reduceHp(hit_power);
    }
}
