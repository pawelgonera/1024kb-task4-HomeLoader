package factories;

import api.HomeFactory;
import api.RoomFactory;
import models.Home;

import java.util.List;

public class HomeFactoryImpl implements HomeFactory
{
    private static HomeFactoryImpl instance = null;
    RoomFactory roomFactory = RoomFactoryImpl.getInstance();

    public static HomeFactoryImpl getInstance()
    {
        if (instance == null)
            instance = new HomeFactoryImpl();

        return instance;
    }

    public Home createHome(List<String> homes, String separator)
    {
        return null;
    }
}
