
import api.RoomFactory;
import factories.RoomFactoryImpl;
import models .*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class RoomFactoryTest
{
    private final RoomFactory roomFactory = RoomFactoryImpl.getInstance();

    @Test
    public void testCreateRoom() {
        //given
        final List<String> homeStr = Arrays.asList(
                "Moj Pokoj%#00ff00%10.5%25%2",
                "Biurko%10%3.5%0.0%2%1.5%0.7%30.3",
                "Lampka%10%35%0.7%0.1%0.1%0.1%0.5"
        );
        final String separator = "%";
        final Element biurko = new Element("Biurko", new Position(10.0f, 3.5f, 0.0f), 30.3f, new Size(2.0f, 1.5f, 0.7f));
        final Element lampka = new Element("Lampka", new Position(10.0f, 35f, 0.7f), 0.5f, new Size(0.1f, 0.1f, 0.1f));
        final Room myRoom = new Room("Moj Pokoj", "#00ff00", 10.5f, 25.0f, Arrays.asList(biurko, lampka));
        //is
        Room result = roomFactory.createRoom(homeStr, separator);
        //expected
        assertEquals(myRoom.toString(), result.toString());
    }
}

