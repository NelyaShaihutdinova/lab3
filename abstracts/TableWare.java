package abstracts;

import enums.Light;
import enums.Size;

public abstract class TableWare {
    private String name;
    private Room room;
    private Size size;
    public TableWare(String name, Room room, Size size) {
        this.name = name;
        this.room = room;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public Size getSize() {
        return size;
    }
}
