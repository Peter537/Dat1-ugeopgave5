package task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(2, 3, 4));
        rooms.add(new Room(1, 2, 3));
        rooms.add(new Room(3, 4, 5));

        Building building = new Building(rooms, 2, 3, true);
        
        int numberOfLamps = countLampsInBuilding(building);
        System.out.println("Number of Lamps: " + numberOfLamps);
        boolean b = isNormal(building);
        System.out.println("Is Normal: " + b);
    }

    public static int countLampsInBuilding(Building building) {
        int lamps = 0;
        for (Room room : building.getRooms()) {
            lamps += room.getNumberOfLamps();
        }
        return lamps;
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}