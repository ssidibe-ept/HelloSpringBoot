package sn.edu.ept.git.dic2.HelloSpringBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sn.edu.ept.git.dic2.HelloSpringBoot.entities.Employe;
import sn.edu.ept.git.dic2.HelloSpringBoot.exceptions.ApiException;
import sn.edu.ept.git.dic2.HelloSpringBoot.repositories.EmployeRepository;

import java.util.List;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public Employe save(Employe employe) {
        if (employe.getNom() == null || employe.getNom().isBlank()){
//            return ResponseEntity.status(451).build();
            throw ApiException.of(451, "Le nom est obligatoire");
        }

        if (employe.getPrenom() == null || employe.getPrenom().isBlank()){
//            return ResponseEntity.status(451).build();
            throw ApiException.of(450, "Le prenom est obligatoire");
        }

        return employeRepository.save(employe);
    }

    public Employe findById(Integer id){
        return employeRepository.findById(id);
    }

    public List<Employe> findAll() {
        return employeRepository.findAll();
    }
}
