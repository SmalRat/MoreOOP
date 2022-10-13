package kick;

import lotr.Character;
import lotr.Hobbit;

public class Crykick extends BasicKick{
    Crykick(Hobbit owner){
        super(owner);
    }
    public void hit(Character other){
        System.out.print(other);
        System.out.print("Hobbit cries...");
    }
}
