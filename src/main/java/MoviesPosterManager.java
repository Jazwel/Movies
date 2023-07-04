import ru.netology.stats.MoviePosters;

public class MoviesPosterManager {
    public MoviePosters[] movies = new MoviePosters[0];

    public int limit;

    public MoviesPosterManager(){
        this.limit = 5;
    }
    public MoviesPosterManager (int limit){
        this.limit = limit;
    }

    public void addMovie(MoviePosters movie) {
        MoviePosters[] tmp = new MoviePosters[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MoviePosters[] findAll()
    {
        return movies;
    }

    public MoviePosters[] findLast() {
        int resultLenght;
        if (movies.length <limit ) {
            resultLenght = movies.length;
        } else {
            resultLenght = limit;
        }
        MoviePosters[] tmp = new MoviePosters[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
