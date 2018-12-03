package factories;

import api.ElementFactory;
import models.Element;

public class ElementFactoryImpl implements ElementFactory
{
    private static ElementFactoryImpl instance = null;

    public static ElementFactoryImpl getInstance()
    {
        if(instance == null)
            instance = new ElementFactoryImpl();

        return instance;
    }

    public Element createElement(String line, String separator)
    {
        return null;
    }
}
