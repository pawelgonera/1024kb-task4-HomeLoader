package factories;

import api.ElementFactory;
import api.RoomFactory;
import models.Room;

import java.util.List;

public class RoomFactoryImpl implements RoomFactory
{
    private static RoomFactoryImpl instance = null;
    ElementFactory elementFactory = ElementFactoryImpl.getInstance();

    public static RoomFactoryImpl getInstance()
    {
        if(instance == null)
            instance = new RoomFactoryImpl();

        return instance;
    }

    public Room createRoom(List<String> lines, String separator)
    {
        return null;
    }
}
