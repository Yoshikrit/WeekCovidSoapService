/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Weekcovid;

/**
 *
 * @author acer
 */
@WebService(serviceName = "WeekCovidWebService")
public class WeekCovidWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("WeekCovidSoapServicePU");

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "findAllWeekCovid")
    public List <Weekcovid> findAllWeekCovid() {
        EntityManager em = emf.createEntityManager();
        List<Weekcovid> coList = (List<Weekcovid>) em.createNamedQuery("Weekcovid.findAll").getResultList();
        return coList;
    }
    
    @WebMethod(operationName = "insertWeekCovid")
    @Oneway
    public void insertWeekCovid(@WebParam(name = "co") Weekcovid co) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(co);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
