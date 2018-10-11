package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> movieList = new ArrayList <>();
        System.out.println("Enter your movie list or q to quit");
        String userInput = " ";
        do{
            userInput = sc.next();
            if(!userInput .equals("q")){
                 movieList.add(userInput);
            }
        }while(!userInput .equalsIgnoreCase("q"));

//        for (String movie:movieList) {
//            System.out.println (movie);

//        }


        System.out.println("You should watch " + Randommovie(movieList) );


    }

    public static String Randommovie(ArrayList <String> movieList){
        Random r = new Random();
        String item = " ";

        for(int i =0; i<movieList.size();i++) {
            int itemIndex = r.nextInt(movieList.size());
            item = movieList.get(itemIndex);
           System.out.println(item);
        }
        return item;

    }
}
