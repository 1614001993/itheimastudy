package com.itheima.moviedemo;

public class MovieTest {
    public static void main(String[] args) {
        Movie mv0 = new Movie(1, "满江红", 45.00, 8.9);
        Movie mv1 = new Movie(2, "流浪地球", 55.00, 9.8);
        Movie mv2 = new Movie(3, "三体", 50.00, 7.5);
        Movie mv3 = new Movie(4, "长津桥", 30.00, 9.7);
        Movie[] arr = {mv0, mv1, mv2, mv3};
        MovieOperator mvO = new MovieOperator(arr);
        mvO.showMovie();
        mvO.showMovieMsg(3);

    }
}
