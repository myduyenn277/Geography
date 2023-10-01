package Geo.controller;

import java.util.ArrayList;

import Geo.dataAccess.EastAsiaCountriesDao;
import Geo.model.Country;
import Geo.repository.GeoRepository;
import Geo.view.Menu;

public class Program extends Menu<String> {
   
    private GeoRepository geoRepository;
    static String[] op = {" Enter the information for 11 countries in Southeast Asia",
            " Display already information",
            " Search the country according to the entered country's name" ,
            "Display the information increasing with the country name" ,
              "Exit"};

    public Program() {
        super("Equation Program Menu", op);
        geoRepository = new GeoRepository();
    }

    @Override
    public void execute(int n) {
               ArrayList<Country> lc = new ArrayList<>();
        switch (n) {
            case 1: {
               EastAsiaCountriesDao.printCountry(lc);
                break;
            }
            case 2: {
               EastAsiaCountriesDao.printCountry(lc);
                break;
            }
            case 3: {
                EastAsiaCountriesDao.searchByName(lc);
            }
            case 4 :{
                EastAsiaCountriesDao.printCountrySorted(lc);
            }
            case 5:

                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }
}

