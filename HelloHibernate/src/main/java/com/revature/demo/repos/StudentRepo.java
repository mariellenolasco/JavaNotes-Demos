package com.revature.demo.repos;

import com.revature.demo.config.HibernateConfig;
import com.revature.demo.models.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.Optional;

public class StudentRepo {
    private SessionFactory sessionFactory = HibernateConfig.buildSessionFactory();
    public Student addStudent(Student student) {
        Transaction tx = null;
        try(Session session= sessionFactory.getCurrentSession()){
            tx = session.beginTransaction();
            session.save(student);
            tx.commit();
        } catch (Exception ex){
            ex.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }
        return student;
    }
    public Student getStudentById_get(int id){
        Student retrievedStudent = null;
        Transaction tx = null;
        try(Session session = sessionFactory.getCurrentSession()){
            tx = session.beginTransaction();
            retrievedStudent = session.get(Student.class, id);// return null if not found, eagerly fetched, returns actual persisted object
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null){
                tx.rollback();
            }
        }
        return retrievedStudent;
    }
    public Student loadStudentbyId(int id){
        Student retrievedStudent = null;
        Transaction tx = null;
        try(Session session = sessionFactory.getCurrentSession()){
            /*
            * .load() returns a proxy object, which is converted into a persistent object
            * when any method on the proxy is invoked (lazily fetched)
            * */
            session.beginTransaction();
            retrievedStudent = session.load(Student.class, id);// throws object not found exception
            Hibernate.initialize(retrievedStudent);
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null){
                tx.rollback();
            }
        }
        return retrievedStudent;
    }
    public Optional<Student> getStudentByEmail(String email){
        Optional<Student> _retrievedStudent = Optional.empty();
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            Query query = session.getNamedNativeQuery("getStudentByEmail");
            query.setParameter("email", email);
            _retrievedStudent = Optional.of((Student) query.getSingleResult());

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return _retrievedStudent;
    }
    /*
    * Transaction tx = null;
        try(Session session = sessionFactory.getCurrentSession()){

        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null){
                tx.rollback();
            }
        }
    * */
}
