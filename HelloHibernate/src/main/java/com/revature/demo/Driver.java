package com.revature.demo;

import com.revature.demo.config.HibernateConfig;
import com.revature.demo.models.Student;
import com.revature.demo.repos.StudentRepo;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.Optional;

public class Driver {
    private final static StudentRepo studentRepo = new StudentRepo();
    public static void main(String[] args){
        try(Session session = HibernateConfig.buildSessionFactory().getCurrentSession()){
            if(session == null){
                System.out.println("Could not establish connection to DB!");
            } else {
                System.out.println("Connection established");
            }
            addStudentDemo();
            getStudentUsingGet();
            getStudentUsingLoad();
            getStudentByEmailUsingNamedNativeQuery();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void addStudentDemo(){
        //Create student demo
        Student student1 = new Student("Wezley", "Singleton", "Wezley@Singleton.com");
        student1 = studentRepo.addStudent(student1);
        System.out.println(student1);
    }
    public static void getStudentUsingGet(){
        Student s = studentRepo.getStudentById_get(1);
        System.out.println(s);
    }
    public static void getStudentUsingLoad(){
        Student s = studentRepo.loadStudentbyId(1);
        //throws a lazyinitexception since we are trying to init the proxy outside of the session
        System.out.println(s);
    }
    public static void getStudentByEmailUsingNamedNativeQuery(){
        Optional<Student> _s = studentRepo.getStudentByEmail("Wezley@Singleton.com");
       // _s.ifPresent(System.out::println);
    }
}
