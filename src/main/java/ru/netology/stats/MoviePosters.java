package ru.netology.stats;

public class MoviePosters {
    private int movieId;
    private String movieTitle;
    private String movieGen;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGen() {
        return movieGen;
    }

    public void setMovieGen(String movieGen) {
        this.movieGen = movieGen;
    }

    public MoviePosters(int movieId, String movieTitle, String movieGen) {
        this.movieId = movieId;
        this.movieGen = movieGen;
        this.movieTitle = movieTitle;
    }

}
