package net.salesianos.lacuesta.actividades.actividad3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct3-fusionar contenido de varios ficheros.txt");
        FileReader frAct1=new FileReader ("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct1.txt");
        FileReader frAct2=new FileReader ("d:\\Escritorio\\Desarrollo de aplicaciones multiplataforma\\Programación\\Tema 6\\Ficheritos\\src\\net\\salesianos\\lacuesta\\ficheros\\ficheroAct2.txt");
        int decimalAct1;
        int decimalAct2;
        char caracter;
        String texto1="";
        String texto2="";
        int i=0;
        do{
            decimalAct1=frAct1.read();
            caracter=(char) decimalAct1;
            if(i==0){
                texto1+="Contenido del fichero uno: ";
            }
            if(decimalAct1!=-1){
                texto1+=caracter;
            }

            i++;
        }while(decimalAct1!=-1);
        texto1+="\n";
        i=0;
        do{
            decimalAct2=frAct2.read();
            caracter=(char) decimalAct2;
            if(i==0){
                texto2+="Contenido del fichero dos: ";
            }
            if(decimalAct2!=-1){
                texto2+=caracter;
            }

            i++;
        }while(decimalAct2!=-1);

        texto1+=texto2;

        fw.write(texto1);
        fw.close();
        frAct1.close();
        frAct2.close();

    }
}
