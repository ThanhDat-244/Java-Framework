package SpringFramework.main;

import SpringFramework.config.VehicleConfig;
import SpringFramework.entities.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());

        veh.printHello();
    }

}
