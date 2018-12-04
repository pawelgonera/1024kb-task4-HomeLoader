package models;

import java.util.List;

public class Home
{
    private String homeName;
    private String address;
    private int householdersCounter;
    private List<Room> rooms;

    public Home(String homeName, String adress, int householdersCounter, List<Room> rooms)
    {
        this.homeName = homeName;
        this.address = adress;
        this.householdersCounter = householdersCounter;
        this.rooms = rooms;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public int getHouseholdersCounter() {
        return householdersCounter;
    }

    public void setHouseholdersCounter(int householdersCounter) {
        this.householdersCounter = householdersCounter;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString()
    {
        return "Home{" +
                "homeName='" + homeName + '\'' +
                ", address='" + address + '\'' +
                ", householdersCounter=" + householdersCounter +
                ", rooms=" + rooms +
                '}';
    }
}
