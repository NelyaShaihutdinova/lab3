package sceneObjects;

import abstracts.CanBroke;
import abstracts.Furniture;
import abstracts.Room;
import abstracts.Sittable;
import enums.Brokenness;

public class Chair extends Furniture implements Sittable, CanBroke {
    private Brokenness brokenness;
    public Chair(String name, Room room, Brokenness brokenness) {
        super(name, room);
        this.brokenness = brokenness;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void broke(Brokenness brokenness) {
        this.brokenness = brokenness;
    }
}
