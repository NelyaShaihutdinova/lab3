package abstracts;

public abstract class Furniture {
    private String name;
    private Room room;
    public Furniture(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public String getName() {
        return name;
    }
}
