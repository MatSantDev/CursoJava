package Exercice.Files.File5;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strPath = "C:\\Users\\Mateus\\IdeaProjects\\CursoJava\\texto.txt";
        File file = new File(strPath);

        System.out.println("Name: " + file.getName());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Path: " + file.getPath());
        System.out.println("AbsoluteFile: " + file.getAbsoluteFile());
        System.out.println("Class: " + file.getClass());
        System.out.println("ToString: " + file.toString());
        System.out.println("Existe? : " + file.exists());
        System.out.println("Deletou: " + file.delete());
        System.out.println("Existe? : " + file.exists());

    }
}
