package Exercice.Files.File1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Mateus\\IdeaProjects\\CursoJava\\texto.txt");
        Scanner sc = null;
        try {
            if (file.exists()){
                sc = new Scanner(file);
                while (sc.hasNextLine()){
                    System.out.println(sc.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }
        }

    }
}
