package task2;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private final List<Room> rooms;
    private final int numberOfBathrooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;

    public Building(List<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
