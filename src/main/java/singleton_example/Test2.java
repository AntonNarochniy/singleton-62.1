package singleton_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //создаю два объекта со скоупом singleton, но в консоли видно что он создался единожды
        SingletonExample singletonExample1 = context.getBean("singletonExample", SingletonExample.class);
        SingletonExample singletonExample2 = context.getBean("singletonExample", SingletonExample.class);
        // сравниваю их ссылки, так как это singleton, то объектыы ссылаются на одну ссылку
        System.out.println("одинаковые ли объекты singletonExample1 и singletonExample2? " + (singletonExample1 == singletonExample2));

        //создаю два объекта со скоупом prototype, в консоли видно, что создано два объекта
        PrototypeExample prototypeExample1 = context.getBean("prototypeExample", PrototypeExample.class);
        PrototypeExample prototypeExample2 = context.getBean("prototypeExample", PrototypeExample.class);
        //сравниваю их ссылки, видно что это разные ссылки
        System.out.println("одинаковые ли объекты prototypeExample1 и prototypeExample2 ? " + (prototypeExample1 == prototypeExample2));

        context.close();
    }
}
