package service;

import api.HomeLoader;
import api.HomeFactory;
import factories.HomeFactoryImpl;
import models.Home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {

        }catch (IOException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
