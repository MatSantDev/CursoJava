package Exercice.Files.File6;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Caminho: ");
        String strPath = "C:\\Users\\Mateus\\IdeaProjects\\CursoJava\\subdir\\filecsv.csv";
        System.out.println(strPath);
        File file = new File(strPath);

        List<String> texto = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while (line != null){
                texto.add(line);
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error na leitura");
            throw new RuntimeException(e);
        }

        List<String> novoTexto = new ArrayList<>();
        for (String linha : texto){
            String[] ordemItem = linha.split(",");
            String nome = ordemItem[0];
            String strPreco = ordemItem[1];
            String strQuant = ordemItem[2];

            Double preco = Double.parseDouble(strPreco);
            Integer quant = Integer.parseInt(strQuant);

            Double total = preco * quant;
            String novaLinha = nome + "," + total;
            novoTexto.add(novaLinha);
        }

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file.getParent() + "/summary.csv"))){

            for (String linha : novoTexto){
                br.write(linha);
                br.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error na escrita");
            throw new RuntimeException(e);
        }

    }
}
