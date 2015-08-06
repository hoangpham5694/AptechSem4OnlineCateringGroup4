/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.pojo.Foods;
import model.pojo.Suppliers;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author MSI
 */
public class FoodsDAO {

    @Autowired
    public final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Foods> getFoodsByMenu(int menuId) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive()) {
                sessionFactory.getCurrentSession().getTransaction().begin();
            }
            Query query = sessionFactory.getCurrentSession().createQuery("select food,submenu,menu from Foods food join food.subMenus submenu join submenu.menus menu where menu.id =:menuId ");
            query.setParameter("menuId", menuId);
            List list = query.list();
            Iterator ite = list.iterator();
            List<Foods> listFoods = new ArrayList<>();

            while (ite.hasNext()) {
                Object[] obj = (Object[]) ite.next();
                Foods food = new Foods();
                food = (Foods) obj[0];
                listFoods.add(food);
            }
            return listFoods;
        } catch (Exception ex) {
            ex.printStackTrace();
            return  null;
        } finally {
            sessionFactory.getCurrentSession().close();
        }

    }
}