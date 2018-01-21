package com.vamshik;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor("Wooden", new Dimensions(20,20, 3));
        Wall wall = new Wall("Cement", "Cream",new Dimensions(15,16,2));

        Room room = new Room(wall,floor);

        room.getWall().setWindowsToWalls(4);
        room.setFloor();
    }
}
