package springframework.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springframework.config.VehicleConfig;
import springframework.entities.Vehicle;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle honda = new Vehicle();
        honda.setName("Honda");
        Supplier<Vehicle> hondaSupplier = () -> honda;

        Supplier<Vehicle> audiSupplier = () -> {
            var audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Number is: " + randomInt);

        if(randomInt %2==0){
            context.registerBean("honda", Vehicle.class, hondaSupplier);
        }else{
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());
        veh.printHello();
    }

}
