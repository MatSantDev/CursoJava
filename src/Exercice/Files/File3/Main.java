package Exercice.Files.File3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "C:\\Users\\Mateus\\IdeaProjects\\CursoJava\\outtexto.txt";
        String[] lines = {"New line", "New new line"};
        try (BufferedWriter br = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                br.write(line);
                br.newLine();
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
}
