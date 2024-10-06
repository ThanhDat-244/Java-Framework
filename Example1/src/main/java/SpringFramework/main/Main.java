package SpringFramework.main;

import SpringFramework.config.VehicleConfig;
import SpringFramework.entities.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    /**
     * Main method to demonstrate the use of Spring framework. This method
     * will create a non-spring context Vehicle object and then create a
     * Spring context using the {@link VehicleConfig} class. It will then
     * fetch a bean of type {@link Vehicle} and {@link String} and
     * {@link Integer} from the Spring context and print out the values.
     * @param args The command line arguments
     */

    public static void main(String[] args) {

        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        System.out.println("Vehicle name from non-spring context is: "+veh.getName());

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        //Vehicle vehicle = context.getBean("vehicle",Vehicle.class);
        //Use to fix NoUniqueBeanDefinitionException
        System.out.println(vehicle.getName());

        /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn’t exist,Spring will throw an exception.
        * */
        String hello = context.getBean(String.class);
        System.out.println(hello);
        int num = context.getBean(Integer.class);
        System.out.println(num);
    }
}
