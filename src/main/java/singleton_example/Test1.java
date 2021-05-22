package singleton_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {

    public static void main(String[] args) {
        //создаю только контекст, не вызывая создание ни одного объекта.
        //видно, что объект со скоупом singleton создался, а объект со скоупом prototype
        //не создался. Для создания объекта со скоупом prototype нужно обратиться к нему и создать его
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        context.close();
    }
}
