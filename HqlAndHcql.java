package com.hibernatehql.Hibernatehqldemo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Books b = new Books();
        Configuration cf=new Configuration().configure().addAnnotatedClass(Books.class);
        SessionFactory sf=cf.buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        // Query q =s.createQuery("from Books");select query in hql by class Name
/*
  hql update query
  
       Query q =s.createQuery("update Books set bname=:n where bid=:i");
       q.setParameter("n", "lmn");
       q.setParameter("i", 2);
         int status = q.executeUpdate();
                //System.out.println("1 row updated"+status);
       */
        //q.setFirstResult(0);by pagination
       // q.setMaxResults(1);
       
        /*deleting query in hql
        Query q = s.createQuery("delete from Books where bid =3");
     q.executeUpdate();

     System.out.println("1 row deleted");
     */
        /*aggregate functions
        Query q = s.createQuery("select min(cost) from Books");
        List<Integer> list = q.getResultList();
        System.out.println(list.get(0));
        */
        /*
         * HCQL SELECTING
        Criteria c =s.createCriteria(Books.class);
        c.setFirstResult(1);
        c.setMaxResults(3);
        List list = c.list();
        System.out.println(list);
*/
        /*     
         adding restrictions class of criteria interface
        Criteria c = s.createCriteria(Books.class);
        c.add(Restrictions.ge("cost", 50));
        List list = c.list();
        System.out.println(list);
   */     
        /*addOrder for asc and desc selection
        Criteria c = s.createCriteria(Books.class);
        c.addOrder(Order.asc("cost"));
        List list = c.list();
        System.out.println(list);
        */  
        /*
         projection to get specific column
        Criteria c = s.createCriteria(Books.class);
        c.setProjection(Projections.property("bname"));
        List list = c.list();
        System.out.println(list);
        */
        s.getTransaction().commit();
        s.close();
    }
}