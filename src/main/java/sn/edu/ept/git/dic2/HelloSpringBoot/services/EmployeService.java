package sn.edu.ept.git.dic2.HelloSpringBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.ept.git.dic2.HelloSpringBoot.entities.Employe;
import sn.edu.ept.git.dic2.HelloSpringBoot.repositories.EmployeRepository;

import java.util.List;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public Employe save(Employe employe){
        return employeRepository.save(employe);
    }

    public Employe findById(Integer id){
        return employeRepository.findById(id);
    }

    public List<Employe> findAll() {
        return employeRepository.findAll();
    }
}
