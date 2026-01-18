package Exercice.Files.File4;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      System.out.println("Write path: ");
//      String strPath = sc.nextLine();
        String strPath = "C:\\Users\\Mateus\\IdeaProjects\\CursoJava";

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files");
        for (File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println(sucess);

        sc.close();
    }
}
