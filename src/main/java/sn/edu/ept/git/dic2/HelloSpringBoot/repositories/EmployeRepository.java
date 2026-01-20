package sn.edu.ept.git.dic2.HelloSpringBoot.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Transient;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import sn.edu.ept.git.dic2.HelloSpringBoot.entities.Employe;

import java.util.List;

@Repository
public class EmployeRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Employe save(Employe employe){
        if(employe.getId()==null){
            em.persist(employe);
        }else{
            Employe emp = em.find(Employe.class, employe.getId());
            emp.setNom(employe.getNom());
            emp.setPrenom(employe.getPrenom());
            emp.setSalary(employe.getSalary());
        }

        return employe;
    }

    public Employe findById(Integer id){
        return em.find(Employe.class, id);
    }

    public List<Employe> findAll() {
        return em.createQuery("select e from Employe e", Employe.class).getResultList();
    }
}
