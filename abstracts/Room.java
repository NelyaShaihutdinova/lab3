package abstracts;

public abstract class Room {
    final private String name;
    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
