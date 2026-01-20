package sn.edu.ept.git.dic2.HelloSpringBoot.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Personne {
    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

}