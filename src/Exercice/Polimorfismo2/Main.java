package Exercice.Polimorfismo2;

import Exercice.Polimorfismo2.Entities.ImportedProduct;
import Exercice.Polimorfismo2.Entities.Product;
import Exercice.Polimorfismo2.Entities.UsedProduct;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #"+(1+i)+" data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String escolha = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            Product product;
            if(escolha.startsWith("i")){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                sc.nextLine();
                product = new ImportedProduct(name, price, customsFee);
            }else if (escolha.startsWith("u")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.nextLine());
                product = new UsedProduct(name, price, date);
            }else{
                product = new Product(name, price);
            }

            System.out.println();
            products.add(product);
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
