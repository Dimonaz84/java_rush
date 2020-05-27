package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> movies = new ArrayList<>();
        while (true) {
            String input = reader.readLine();
            if (!input.equals("soapOpera") && !input.equals("thriller") && !input.equals("cartoon")) {
                movies.add(input);
                break;
            }
            movies.add(input);
        }

        Movie movie = null;
        for (String movieKey : movies) {
            try {
                movie = MovieFactory.getMovie(movieKey);
                System.out.println(movie.getClass().getSimpleName());
            } catch (NullPointerException e){
            }
        }
    }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
