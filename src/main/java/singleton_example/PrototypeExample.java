package singleton_example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeExample {
    @Value("prototype")
    String name;
@Autowired
    public PrototypeExample() {
        System.out.println("prototype created");
    }


}

