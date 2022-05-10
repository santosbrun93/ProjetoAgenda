package com.projeto.Agenda.controller;

import com.projeto.Agenda.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try{
            loadSessionFactory();
        }catch(Exception e){
            System.err.println("Exception while initializing hibernate util.. ");
        }
    }

    public static void loadSessionFactory(){

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Pessoa.class);
        configuration.addAnnotatedClass(Cliente.class);
        configuration.addAnnotatedClass(Profissional.class);
        configuration.addAnnotatedClass(Endereco.class);
        configuration.addAnnotatedClass(Bairro.class);
        configuration.addAnnotatedClass(Cidade.class);
        configuration.addAnnotatedClass(Estado.class);
        configuration.addAnnotatedClass(Pais.class);
        configuration.addAnnotatedClass(Procedimento.class);
        configuration.addAnnotatedClass(Sessao.class);
        configuration.addAnnotatedClass(Espaco.class);

        ServiceRegistry srvcReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(srvcReg);
    }

    public static Session getSession() throws HibernateException {

        Session retSession=null;
        try {
            retSession = sessionFactory.openSession();
        }catch(HibernateException t){
            System.err.println("Exception while getting session.. ");
        }
        if(retSession == null) {
            System.err.println("session is discovered null");
        }

        return retSession;
    }
}
