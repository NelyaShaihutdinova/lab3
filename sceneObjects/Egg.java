package sceneObjects;

import abstracts.CanBePourOut;
import abstracts.CanBroke;
import abstracts.RowFood;
import enums.Brokenness;

public class Egg extends RowFood implements CanBroke, CanBePourOut {

    public Egg(String name) {
        super(name);
    }

    @Override
    public void broke(Brokenness brokenness) {
        super.broke(brokenness);
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
