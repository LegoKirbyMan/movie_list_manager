package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManTest {
    private String[] testMovieList = {
        "Бладшот",
        "Вперёд",
        "Отель Белград",
        "Джентельмены",
        "Человек-Невидимка",
        "Тролли. Мирововой тур"
    };
    
    @Test
    void addMovieTest() {
        MovieMan manager = new MovieMan();
        for (int i=0; i<testMovieList.length; i++){
            manager.addMovie(testMovieList[i]);
        }

        Assertions.assertArrayEquals(testMovieList, manager.getList());
    }

    @Test
    void findAllTest() {
        MovieMan manager = new MovieMan();
        for (int i=0; i<testMovieList.length; i++){
            manager.addMovie(testMovieList[i]);
        }

        Assertions.assertArrayEquals(testMovieList, manager.findAll());
    }

    @Test
    void findLastTest() {
        MovieMan manager = new MovieMan();
        for (int i=0; i<testMovieList.length; i++){
            manager.addMovie(testMovieList[i]);
        }

        String[] expected = java.util.Arrays.copyOfRange(testMovieList, 1, 6);
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

        MovieMan manager2 = new MovieMan(3);
        for (int i=0; i<testMovieList.length; i++){
            manager2.addMovie(testMovieList[i]);
        }

        expected = java.util.Arrays.copyOfRange(testMovieList, 3, 6);
        actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
