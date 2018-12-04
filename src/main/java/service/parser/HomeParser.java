package service.parser;

import models.properties.HomeProperty;

import java.util.EnumMap;
import java.util.Map;

public class HomeParser
{
    Map<HomeProperty, String> homeDetails = new EnumMap<HomeProperty, String>(HomeProperty.class);

    public String parseHome(String line)
    {
        String[] values = line.split("%");

        homeDetails.put(HomeProperty.HOME_NAME, values[0]);
        homeDetails.put(HomeProperty.ADDRESS, values[1]);
        homeDetails.put(HomeProperty.HOMEMADE_COUNT, values[2]);
        homeDetails.put(HomeProperty.ROOM_COUNTS, values[3]);

        return null;
    }
}
