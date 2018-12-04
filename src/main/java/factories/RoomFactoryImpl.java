package factories;

import api.ElementFactory;
import api.RoomFactory;
import models.Element;
import models.Room;
import models.properties.RoomProperty;

import java.util.*;

public class RoomFactoryImpl implements RoomFactory
{
    private static RoomFactoryImpl instance = null;
    ElementFactory elementFactory = ElementFactoryImpl.getInstance();
    Map<RoomProperty, String> roomDetails = new EnumMap<>(RoomProperty.class);

    public static RoomFactoryImpl getInstance()
    {
        if(instance == null)
            instance = new RoomFactoryImpl();

        return instance;
    }

    public Room createRoom(List<String> lines, String separator)
    {
        String[] values = lines.get(0).split(separator);

        roomDetails.put(RoomProperty.ROOM_NAME, values[0]);
        roomDetails.put(RoomProperty.ROOM_COLOR_HEX, values[1]);
        roomDetails.put(RoomProperty.HEIGHT, values[2]);
        roomDetails.put(RoomProperty.AREA, values[3]);
        roomDetails.put(RoomProperty.COUNT_ELEMENTS, values[4]);

        List<Element> elements = new LinkedList<>();

        //get number of elements for how many iteration will be doing
        int elementsCount = Integer.parseInt(roomDetails.get(RoomProperty.COUNT_ELEMENTS));
        for(int i = 1; i <= elementsCount; i++)
        {
            //collect String lines with elements infos to List
            elements.add(elementFactory.createElement(lines.get(i), separator));
        }

        return new Room(
                roomDetails.get(RoomProperty.ROOM_NAME),
                roomDetails.get(RoomProperty.ROOM_COLOR_HEX),
                Float.parseFloat(roomDetails.get(RoomProperty.HEIGHT)),
                Float.parseFloat(roomDetails.get(RoomProperty.AREA)),
                elements
        );
    }
}
