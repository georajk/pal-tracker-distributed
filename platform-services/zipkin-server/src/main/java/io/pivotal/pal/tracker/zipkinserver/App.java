package io.pivotal.pal.tracker.zipkinserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("io.pivotal.pal.tracker.zipkinserer")
@EnableZipkinStreamServer
public class App  {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
