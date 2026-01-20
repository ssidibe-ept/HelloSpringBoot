package sn.edu.ept.git.dic2.HelloSpringBoot.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DepartementInit implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("init de departement");
    }
}
