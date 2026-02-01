package Exercice.Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        String path = "C:\\Users\\Mateus\\IdeaProjects\\CursoJava\\subdir\\logs.txt";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Set<UsersLogs> logs = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fealds = line.split(" ");
                Date data = sdf.parse(fealds[1]);
                logs.add(new UsersLogs(fealds[0], data));
                line = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(logs);
        System.out.println("Total users: " + logs.size());
    }

}
