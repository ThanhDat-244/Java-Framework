package springframework.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springframework.config.VehicleConfig;
import springframework.entities.Vehicle;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        //System.out.println(veh.getName());
        context.close();//use to test @PreDestroy
    }
}
