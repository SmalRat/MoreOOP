package kick;

import lotr.Character;
import lotr.Elf;

public class ElfKick extends BasicKick{
    ElfKick(Elf owner){
        super(owner);
    }
    public void hit(Character other){
        if(other.getPower() < owner.getPower()) {
            other.setHp(0);
        }
        else{
            owner.reducePower(1);
        }
    }
}
