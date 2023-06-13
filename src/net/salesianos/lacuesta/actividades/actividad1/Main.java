package net.salesianos.lacuesta.actividades.actividad1;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        FileWriter fw=new FileWriter("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct1.txt");
        String texto;
        do{
            System.out.println("Introduce un texto");
            texto=scanner.nextLine();
            if(texto.length()<30){
                System.out.println("Te faltaron "+(30-texto.length())+" caracteres");
            }
        }while(texto.length()<30);

        texto=texto.replace(" ","_").toUpperCase();

        for(int i=0;i<texto.length();i++){
            fw.write(texto.charAt(i));
        }
        fw.close();
    }
}
