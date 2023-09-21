package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
   /**
    * Méthode main de l'application qui affiche un message retourné par la méthode hello()
    * @param args
    */
    public static void main( String[] args )
    {
        System.out.println(hello());
    }

    /**
     * Méthode qui retourne un message "Hello World!" de type String
     * @return String "Hello World!"
     */
    public static String hello() {
        return  "Hello World!" ;
    }

    /**
     * Méthode qui retourne un message de type String en fonction du paramètre d'entrée 
     * @param param
     * @return
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
