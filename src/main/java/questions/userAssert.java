package questions;

import org.junit.Assert;
import java.util.Arrays;
import java.util.List;


public class userAssert {

    public static void StatusCodeValidation(int statusCode){
        List<Integer> allowedStatusCodes = Arrays.asList(200, 201, 204);
        Assert.assertTrue("El código de estado no está permitido", allowedStatusCodes.contains(statusCode));

    }

}
