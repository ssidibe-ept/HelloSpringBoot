package sn.edu.ept.git.dic2.HelloSpringBoot.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sn.edu.ept.git.dic2.HelloSpringBoot.entities.Employe;
import sn.edu.ept.git.dic2.HelloSpringBoot.repositories.EmployeRepository;

@Component
@Order(2)
public class EmployeInit implements CommandLineRunner {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("initialisation des employés");
        Employe e1 = new Employe();
        e1.setPrenom("Abdou");
        e1.setNom("Ba");
        e1.setSalary(200000.0);
        employeRepository.save(e1);

        Employe e2 = new Employe();
        e2.setPrenom("Fatou");
        e2.setNom("Ndiaye");
        e2.setSalary(500000.0);
        employeRepository.save(e2);

    }
}
