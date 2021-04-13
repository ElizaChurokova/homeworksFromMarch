import entity.Pizza;
import entity.PizzaBox;
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

//       List<Pizza> pizzasResult = getAll();
//       System.out.println(pizzasResult);

//       List<Pizza> pizzas = getAll();
//       pizzas.stream().filter(x -> x.getWeight() < 350).forEach(x -> System.out.println(x));
//PizzaBox:

//        PizzaBox pizzaBox1 = new PizzaBox(1L, "Red", "Togolok-Moldo");
//        PizzaBox pizzaBox2 = new PizzaBox(2L, "Yellow", "TSovetskaya");
//        PizzaBox pizzaBox3 = new PizzaBox(3L, "White", "Bokonbaeva");
//        create(pizzaBox1);
//        create(pizzaBox2);
//        create(pizzaBox3);

//        List<PizzaBox> pizzaBoxesResult = getAll();
//        System.out.println(pizzaBoxesResult);

        List<PizzaBox> pizzaBoxes = getAll();
        pizzaBoxes.stream().filter(x -> x.getId() = 1).forEach(x -> System.out.println("Pepperoni is in " + x));

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

//    public static List<Pizza> getAll(){
//        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
//        @SuppressWarnings("unchecked")
//        List<Pizza> pizzas = hibernateSession.createQuery("FROM Pizza").list();
//        hibernateSession.close();
//        System.out.println("Found" + pizzas.size()+ "pizzas");
//        return pizzas;
//    }




    //PizzaBox:
    public static <T> T saveOrUpdate(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }

    public static Long create (PizzaBox pizzaBox) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizzaBox);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Successfully created " + pizzaBox.toString());
        return pizzaBox.getId();
    }
    public static List<PizzaBox> getAll(){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<PizzaBox> pizzaBoxes = hibernateSession.createQuery("FROM PizzaBox").list();
        hibernateSession.close();
        System.out.println("Found" + pizzaBoxes.size()+ "pizzas");
        return pizzaBoxes;
    }
    public static PizzaBox findById(Integer id){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        PizzaBox pizzaBox = (PizzaBox) hibernateSession.load(PizzaBox.class,id);
        hibernateSession.close();
        System.out.println("Found " + pizzaBox + " pizzaBox");
        return pizzaBox;
    }


    }

