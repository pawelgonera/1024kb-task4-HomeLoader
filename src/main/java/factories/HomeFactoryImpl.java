package factories;

import api.HomeFactory;
import api.RoomFactory;
import models.Home;
import models.Room;
import models.properties.HomeProperty;

import java.util.*;

public class HomeFactoryImpl implements HomeFactory
{
    private static HomeFactoryImpl instance = null;
    RoomFactory roomFactory = RoomFactoryImpl.getInstance();
    Map<HomeProperty, String> homeDetails = new EnumMap<>(HomeProperty.class);

    public static HomeFactoryImpl getInstance()
    {
        if (instance == null)
            instance = new HomeFactoryImpl();

        return instance;
    }

    public Home createHome(List<String> lines, String separator)
    {
        String[] values = lines.get(0).split(separator);

        homeDetails.put(HomeProperty.HOME_NAME, values[0]);
        homeDetails.put(HomeProperty.ADDRESS, values[1]);
        homeDetails.put(HomeProperty.HOMEMADE_COUNT, values[2]);
        homeDetails.put(HomeProperty.ROOM_COUNTS, values[3]);

        List<Room> rooms = new LinkedList<>();
        List<String> nextLines = new LinkedList<>();
        for(int i = 1; i < lines.size();)
        {
            if(lines.get(i).startsWith("Pokoj"))
            {
                String[] room = lines.get(i).split(separator);
                int elementsCount = Integer.parseInt(room[4]);
                for(int j = 0; j <= elementsCount; j++)
                {
                    nextLines.add(lines.get(i));
                    i++;
                }
                rooms.add(roomFactory.createRoom(nextLines, separator));
                nextLines.clear();
            }
        }

        return new Home(
                homeDetails.get(HomeProperty.HOME_NAME),
                homeDetails.get(HomeProperty.ADDRESS),
                Integer.parseInt(homeDetails.get(HomeProperty.HOMEMADE_COUNT)),
                rooms
        );
    }
}
