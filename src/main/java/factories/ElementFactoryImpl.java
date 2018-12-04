package factories;

import api.ElementFactory;
import models.Element;
import models.Position;
import models.Size;
import models.properties.ElementProperty;

import java.util.EnumMap;
import java.util.Map;

public class ElementFactoryImpl implements ElementFactory
{
    private static ElementFactoryImpl instance = null;
    Map<ElementProperty, String> elementDetails = new EnumMap<>(ElementProperty.class);

    public static ElementFactoryImpl getInstance()
    {
        if(instance == null)
            instance = new ElementFactoryImpl();

        return instance;
    }

    public Element createElement(String line, String separator)
    {
        String[] values = line.split(separator);

        elementDetails.put(ElementProperty.ELEMENT_NAME, values[0]);
        elementDetails.put(ElementProperty.POSITION_X, values[1]);
        elementDetails.put(ElementProperty.POSITION_Y, values[2]);
        elementDetails.put(ElementProperty.POSITION_Z, values[3]);
        elementDetails.put(ElementProperty.LENGTH, values[4]);
        elementDetails.put(ElementProperty.WIDTH, values[5]);
        elementDetails.put(ElementProperty.HEIGHT, values[6]);
        elementDetails.put(ElementProperty.WEIGHT, values[7]);

        Position position = new Position(
                            Float.parseFloat(elementDetails.get(ElementProperty.POSITION_X)),
                            Float.parseFloat(elementDetails.get(ElementProperty.POSITION_Y)),
                            Float.parseFloat(elementDetails.get(ElementProperty.POSITION_Z))
        );

        Size size = new Size(
                Float.parseFloat(elementDetails.get(ElementProperty.LENGTH)),
                Float.parseFloat(elementDetails.get(ElementProperty.WIDTH)),
                Float.parseFloat(elementDetails.get(ElementProperty.HEIGHT))
        );

        return new Element(
                    elementDetails.get(ElementProperty.ELEMENT_NAME),
                    position ,
                    Float.parseFloat(elementDetails.get(ElementProperty.WEIGHT)),
                    size
        );
    }
}
