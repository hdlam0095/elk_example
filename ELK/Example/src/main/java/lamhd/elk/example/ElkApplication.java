package lamhd.elk.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lamhd.elk.example.controller.ELKController;

@SpringBootApplication
public class ElkApplication {

    private static final Logger log = LoggerFactory.getLogger(ElkApplication.class);

    public static void main(String[] args) {
        log.info("-------------- START ELK APPLICATION -----------------");
        SpringApplication.run(ElkApplication.class, args);
    }
}
