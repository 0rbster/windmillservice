package nl.hu.iac.service;

import nl.hu.iac.service.model.Windmill;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Jeroen on 23-Mar-17.
 */
public class WindmillServiceImpl {
    ArrayList<Windmill> windmills = new ArrayList<>();


    public WindmillServiceImpl() {
        windmills.add(new Windmill(1, "windyINC", 685, 2000000));
        windmills.add(new Windmill(2,"Siemens", 700, 2350000));
        windmills.add(new Windmill(3, "Bergey", 785, 3000000));
        windmills.add(new Windmill(4, "Zephyr", 850, 3850000));
    }


    //Returns all windmills
    public List<Windmill> getWindmills() {return windmills;}


    //Returns one windmill based on the given id
    public Windmill getWindmillById(int id){
        for (Windmill windmill : windmills) {
            if (windmill.getId() == id) {
                return windmill;
            }
        }
        return null;
    }
    //Returns list of suitable windmills based on the required output of kWh per year and the budget
    public ArrayList<Windmill> getSuitableWindmills(int requiredOutput, double budget){
        ArrayList<Windmill> suitableWindmills = new ArrayList<>();
        for (Windmill windmill : windmills) {
            int yearOutput =  windmill.getBaseOutput() * 365;
            if (requiredOutput <= yearOutput) {
                if (budget >= windmill.getPrice()) {
                    suitableWindmills.add(windmill);
                }
            }
        }
        return suitableWindmills;
    }

    //Adds a new windmill to the list of windmills
    public Windmill add(Windmill windmill) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        windmill.setId(randomInt);
        windmills.add(windmill);
        return windmill;
    }
}
