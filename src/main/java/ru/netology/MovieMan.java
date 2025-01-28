package ru.netology;

public class MovieMan {

    private String[] movieList;
    private int findLastLength;

    public MovieMan(int findLastLength) {
        this.findLastLength = findLastLength;
    }

    public MovieMan() {
        this(5);
    }

    public String[] getList() {
        return movieList;
    }

    public void addMovie(String title) {
        if (movieList != null) {
            String[] tmp = new String[movieList.length + 1];
            System.arraycopy(movieList, 0, tmp, 0, movieList.length);
            tmp[tmp.length - 1] = title;
            movieList = tmp;
        } else {
            movieList = new String[1];
            movieList[0] = title;
        }
    }

    public String[] findAll() {
        return movieList;
    }

    public String[] findLast() {
        String[] tmp = java.util.Arrays.copyOfRange(movieList, movieList.length - findLastLength, movieList.length);
        return tmp;
    }
}
