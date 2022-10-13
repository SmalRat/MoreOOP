package kick;

import lotr.Character;
import lotr.Hobbit;
import lotr.Elf;
import lotr.Noble;

public class KicksConstructor {
    public Crykick create_kick(Hobbit c){
        return new Crykick(c);
    }
    public ElfKick create_kick(Elf c){
        return new ElfKick(c);
    }
    public NobleKick create_kick(Noble c){
        return new NobleKick(c);
    }
    public BasicKick create_kick(Character c){
        return new BasicKick(c);
    }
}
