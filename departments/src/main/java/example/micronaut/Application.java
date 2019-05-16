package example.micronaut;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) throws IOException {

    	String contents = new String(Files.readAllBytes(Paths.get("data.txt")));
        System.out.println(contents);
    	Micronaut.run(Application.class);
    }
}