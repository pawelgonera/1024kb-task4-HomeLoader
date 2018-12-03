package service;

import api.HomeLoader;
import api.HomeFactory;
import factories.HomeFactoryImpl;
import models.Home;

public class HomeLoaderImpl implements HomeLoader
{
    private static HomeLoaderImpl instance = null;
    private HomeFactory homeFactory = new HomeFactoryImpl();

    public static HomeLoaderImpl getInstance()
    {
        if(instance == null)
            instance = new HomeLoaderImpl();

        return instance;
    }

    public Home loadHome(String fileName, String separator)
    {
        return null;
    }
}
