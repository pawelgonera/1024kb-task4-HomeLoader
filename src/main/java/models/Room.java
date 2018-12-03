package models;

import java.util.List;

public class Room
{
    private String roomName;
    private String roomColor;
    private float roomHeight;
    private float roomArea;
    private List<Element> elements;

    public Room(String roomName, String roomColor, float roomHeight, float roomArea, List<Element> elements)
    {
        this.roomName = roomName;
        this.roomColor = roomColor;
        this.roomHeight = roomHeight;
        this.roomArea = roomArea;
        this.elements = elements;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public void setRoomColor(String roomColor) {
        this.roomColor = roomColor;
    }

    public float getRoomHeight() {
        return roomHeight;
    }

    public void setRoomHeight(float roomHeight) {
        this.roomHeight = roomHeight;
    }

    public float getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(float roomArea) {
        this.roomArea = roomArea;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString()
    {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomColor='" + roomColor + '\'' +
                ", roomHeight=" + roomHeight +
                ", roomArea=" + roomArea +
                ", elements=" + elements +
                '}';
    }
}
