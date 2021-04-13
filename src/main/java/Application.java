import entity.Championship;
import entity.Country;
import entity.SportType;
import entity.Team;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.sound.midi.Soundbank;

public class Application {
    public static void main(String[] args) {
        Country country1 = new Country(1L, "USA");
        Country country2 = new Country(2L, "CHINA");
        Country country3 = new Country(3L, "RUSSIA");
        Country country4 = new Country(4L, "GERMANY");
        Country country5 = new Country(5L, "TURKEY");
        createCountry(country1);
        createCountry(country2);
        createCountry(country3);
        createCountry(country4);
        createCountry(country5);

        SportType sportType1 = new SportType(1L, "FOOTBALL");
        SportType sportType2 = new SportType(2L, "BASKETBALL");
        SportType sportType3 = new SportType(3L, "SWIMMING");
        SportType sportType4 = new SportType(4L, "DISTANCE JUMPING");
        SportType sportType5 = new SportType(5L, "CHESS");
        createSportTypes(sportType1);
        createSportTypes(sportType2);
        createSportTypes(sportType3);
        createSportTypes(sportType4);
        createSportTypes(sportType5);

        Team team1 = new Team(1L, "TeamAAA", "Logo addressA", "www.siteA.org", sportType1);
        Team team2 = new Team(2L, "TeamBBB", "Logo addressB", "www.siteB.org", sportType1);
        Team team3 = new Team(3L, "TeamCCC", "Logo addressC", "www.siteC.org", sportType2);
        Team team4 = new Team(4L, "TeamDDD", "Logo addressD", "www.siteD.org", sportType3);
        Team team5 = new Team(5L, "TeamEEE", "Logo addressE", "www.siteE.org", sportType3);
        Team team6 = new Team(6L, "TeamFFF", "Logo addressF", "www.siteF.org", sportType2);
        Team team7 = new Team(7L, "TeamGGG", "Logo addressG", "www.siteG.org", sportType4);
        Team team8 = new Team(8L, "TeamHHH", "Logo addressH", "www.siteH.org", sportType5);
        Team team9 = new Team(9L, "TeamIII", "Logo addressI", "www.siteI.org", sportType5);
        Team team10 = new Team(10L, "TeamJJJ", "Logo addressJ", "www.siteJ.org", sportType4);
        createTeam(team1);
        createTeam(team2);
        createTeam(team3);
        createTeam(team4);
        createTeam(team5);
        createTeam(team6);
        createTeam(team7);
        createTeam(team8);
        createTeam(team9);
        createTeam(team10);

        Championship championship1 = new Championship(1L, "Championship on Football in US", country1, sportType1);
        Championship championship2 = new Championship(2L, "Championship on Football in CHINA", country2, sportType1);
        Championship championship3 = new Championship(3L, "Championship on Basketball in TURKEY", country5, sportType2);
        Championship championship4 = new Championship(4L, "Championship on Basketball in US", country1, sportType2);
        Championship championship5 = new Championship(5L, "Championship on Swimming in RUSSIA", country3, sportType3);
        Championship championship6 = new Championship(6L, "Championship on distance jumping in US", country1, sportType4);
        Championship championship7 = new Championship(7L, "Championship on chess in GERMANY", country4, sportType5);
        Championship championship8 = new Championship(8L, "Championship on chess in TURKEY", country5, sportType5);
        Championship championship9 = new Championship(9L, "Championship on distance for jumping in RUSSIA", country3, sportType4);
        Championship championship10 = new Championship(10L, "Championship on swimming in US", country4, sportType3);
        creatChampionship(championship1);
        creatChampionship(championship2);
        creatChampionship(championship3);
        creatChampionship(championship4);
        creatChampionship(championship5);
        creatChampionship(championship6);
        creatChampionship(championship7);
        creatChampionship(championship8);
        creatChampionship(championship9);
        creatChampionship(championship10);
    }

    public static Long createCountry(Country country) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(country);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Successfully created " + country.toString());
        return country.getId();
    }
    public static Long createSportTypes(SportType sportTypes) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(sportTypes);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Successfully created " + sportTypes.toString());
        return sportTypes.getId();
    }

    public static Long createTeam(Team team) {
    Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
    hibernateSession.beginTransaction();
    hibernateSession.save(team);
    hibernateSession.getTransaction().commit();
    hibernateSession.close();
        System.out.println("Successfully created " + team.toString());
        return team.getId();
    }

    public static Long creatChampionship(Championship championship){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(championship);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Successfully created " +championship.toString());
        return championship.getId();
    }


    public static <T> T saveOrUpdate(T entity){
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }






//    public static Integer T createEntity(T entity) {
//        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
//        hibernateSession.beginTransaction();
//        hibernateSession.save(entity);
//        hibernateSession.getTransaction().commit();
//        hibernateSession.close();
//        System.out.println("Successfully created " + entity.toString());
//        return entity.getId();
//    }

}


