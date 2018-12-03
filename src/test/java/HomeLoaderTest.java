import api.HomeFactory;
import factories.HomeFactoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeLoaderTest
{
    private final HomeFactory homeFactory = new HomeFactoryImpl();

    @Test
    public void testLoadHome()
    {
        final String fileName = "home.home";
        final String separator = "%";


    }
}
