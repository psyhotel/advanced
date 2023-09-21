package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnableEurekaClient
public class ConfigClient implements CommandLineRunner {

    @Autowired

    static Testt testt;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
//        System.out.println(@Value("${nnn}") hui);

    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(testt.getString());
    }
}