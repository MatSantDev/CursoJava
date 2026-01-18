package Exercice.Criptografia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Descriptografia {

    public static void main(String[] args) {

        String strPath = "C:\\Users\\Mateus\\IdeaProjects\\CursoJava\\subdir\\texto.txt";

        List<String> texto = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while (line != null){
                texto.add(line);
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int chave = 4;
        for (String linha : texto) {
            StringBuilder linhaDecifrada = new StringBuilder();
            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);
                char decifrado = decifrarCesar(c, chave);
                linhaDecifrada.append(decifrado);
            }
            System.out.println(linhaDecifrada.toString());
        }
    }

    public static char decifrarCesar(char c, int chave) {
        if (c >= 'A' && c <= 'Z') {
            return (char) ((c - 'A' - chave + 26) % 26 + 'A');
        }
        if (c >= 'a' && c <= 'z') {
            return (char) ((c - 'a' - chave + 26) % 26 + 'a');
        }
        return c;
    }
}
