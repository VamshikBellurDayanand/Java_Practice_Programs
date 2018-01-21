package com.vamshik;

public class Room {
    private Wall wall;
    private Floor floor;

    public Floor getFloor() {
        return floor;
    }

    public Wall getWall() {

        return wall;
    }

    public Room(Wall wall, Floor floor) {

        this.wall = wall;
        this.floor = floor;
    }

    public void setFloor() {
        floor.setFloorColor("Green");
    }
}
