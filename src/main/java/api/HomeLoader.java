package api;

import models.Home;

public interface HomeLoader
{
    Home loadHome(String fileName, String separator);
}
