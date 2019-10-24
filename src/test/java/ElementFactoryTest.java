
import api.ElementFactory;
import factories.ElementFactoryImpl;
import models.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ElementFactoryTest
{
    private final ElementFactory elementFactory = ElementFactoryImpl.getInstance();

    @Test
    public void testCreateRoom() {
        //given
        final String elementStr = "Lampka%10%35%0.7%0.1%0.1%0.1%0.5";

        final String separator = "%";
        final Element lampka = new Element("Lampka", new Position(10.0f, 35f, 0.7f), 0.5f, new Size(0.1f, 0.1f, 0.1f));

        //is
        Element result = elementFactory.createElement(elementStr, separator);
        //expected
        assertEquals(lampka.toString(), result.toString());
    }
}

