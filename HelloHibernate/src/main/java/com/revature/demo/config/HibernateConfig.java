package com.revature.demo.config;

import com.revature.demo.models.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.reflections.Reflections;


import javax.persistence.Entity;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    /*
    This is a simple utility class provided by the JRE which allows us to load in
    values from a .properties file on our classpath
    */
    private static Properties props = new Properties();

    static{
        try{
            props.load(new FileReader("src/main/resources/app.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * A builder method which is used to instantiate the application's session factory
     * If it does not already exist. If it does, the existing instance is simply returned
     *
     * returns a singleton instance of this application's SessionFactory implementation
     * @return
     */
    public static SessionFactory buildSessionFactory(){
        if(sessionFactory == null){
            System.out.println("Instantiating session factory...");
            try{
                Configuration config = new Configuration();
                config.setProperties(props);
                assignAnnotatedClasses(config);
                //config.addAnnotatedClass(Student.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                                                        .applySettings(config.getProperties())
                                                        .build();
                sessionFactory = config.buildSessionFactory(serviceRegistry);
            } catch (Exception ex){
                ex.printStackTrace();
            }

            System.out.println("Session factory instantiation complete");
        }
        return sessionFactory;
    }

    private static void assignAnnotatedClasses(Configuration configuration){
        Reflections reflect = new Reflections("com.revature.demo.models");
        Set<Class<? extends Object>> entities = reflect.getTypesAnnotatedWith(Entity.class);
        entities.forEach(configuration::addAnnotatedClass);
    }
}
