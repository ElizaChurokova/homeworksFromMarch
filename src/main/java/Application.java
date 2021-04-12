import entity.Pizza;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
     //   Pizza pizza1 = new Pizza(1, "Pepperoni", 500, 300);
       // Pizza pizza2 = new Pizza(2, "Margherita", 600, 450);
        //Pizza pizza3 = new Pizza(3, "Crudo", 700, 500);

        // create(pizza1);
        // create(pizza2);
        // create(pizza3);

       List<Pizza> pizzasResult = getAll();
       System.out.println(pizzasResult);

       List<Pizza> pizzas = getAll();

       pizzas.stream().filter(x -> x.getWeight() < 350).forEach(x -> System.out.println(x));



    }
    public static Integer create (Pizza pizza) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizza);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Successfully created " + pizza.toString());
        return pizza.getId();
    }

    public static List<Pizza> getAll(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Pizza> pizzas = hibernateSession.createQuery("FROM Pizza").list();
        hibernateSession.close();
        System.out.println("Found" + pizzas.size()+ "pizzas");
        return pizzas;


    }


    }

