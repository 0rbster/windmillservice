package nl.hu.iac.rest;

import junit.framework.TestCase;
import nl.hu.iac.service.WindmillServiceImpl;
import nl.hu.iac.service.model.Windmill;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Jeroen on 24-3-2017.
 */
public class WindmillRestServiceTest {

    WindmillRestService windmillRestService =  new WindmillRestService();

    @Test
    public void getWindmill() throws Exception {
        TestCase.assertTrue(windmillRestService.getWindmill(1) != null);
    }

    @Test
    public void getSuitableWindmills() throws Exception {
        TestCase.assertTrue(windmillRestService.getSuitableWindmills(0,0.0).isEmpty());
        TestCase.assertTrue(windmillRestService.getSuitableWindmills(0,9999999999999.99).size() == 5);
    }

    @Test
    public void getAllWindmills() throws Exception {
        TestCase.assertTrue(windmillRestService.getAllWindmills() != null);
    }

    @Test
    public void addWindmill() throws Exception {
        Windmill testmill = new Windmill(999, "test", 685, 29999999);
        TestCase.assertTrue(windmillRestService.addWindmill(testmill) != null);
    }

}