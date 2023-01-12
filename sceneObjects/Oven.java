package sceneObjects;

import abstracts.Furniture;
import abstracts.Kindeble;
import abstracts.Room;
import enums.Light;

public class Oven extends Furniture implements Kindeble {
    private Light light;
    public Oven(String name, Room room) {
        super(name, room);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void kindle(Light light) {
        this.light = light;
    }
}
