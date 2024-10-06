package springframework.entities;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Initializes the vehicle name to "Honda" when the bean is created.
     */
    @PostConstruct
    public void init() {
        System.out.println("helo");
        this.name = "Honda";
    }

    /**
     * Closes the vehicle when the bean is destroyed.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

    public void hello() {
        System.out.println("Hello, this is " + name);
    }
}
