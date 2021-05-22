package singleton_example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SingletonExample {
    @Value("Singleton")
    String name;
@Autowired
    public SingletonExample() {
        System.out.println("singleton created");
    }


}
