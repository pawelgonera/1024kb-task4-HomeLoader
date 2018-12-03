package api;

import models.Home;

import java.util.List;

public interface HomeFactory
{
    Home createHome(List<String> homes, String separator);
}
