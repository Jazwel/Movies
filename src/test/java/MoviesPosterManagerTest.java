import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.stats.MoviePosters;

public class MoviesPosterManagerTest {
    MoviesPosterManager manager = new MoviesPosterManager();
    MoviePosters movie1 = new MoviePosters(1, "фильм 1", "ужасы");
    MoviePosters movie2 = new MoviePosters(2, "фильм 2", ",боевик");
    MoviePosters movie3 = new MoviePosters(3, "фильм 3", ",комедия");
    MoviePosters movie4 = new MoviePosters(4, "фильм 4", ",триллер");
    MoviePosters movie5 = new MoviePosters(5, "фильм 5", ",детектив");
    MoviePosters movie6 = new MoviePosters(6, "фильм 6", ",драма");
    MoviePosters movie7 = new MoviePosters(7, "фильм 7", ",фантастика");
    MoviePosters movie8 = new MoviePosters(8, "фильм 8", ",мультфильм");

    @BeforeEach
    public void setUp(){
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
    }
    @Test
            public void shouldAddMovie() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.addMovie(movie1);
        MoviePosters[] expected = {movie1};
        MoviePosters[]actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldFindAll(){
        MoviePosters[] expected = {movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8};
        MoviePosters[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldFindLast(){
        MoviePosters[] expected ={movie8,movie7,movie6,movie5,movie4};
        MoviePosters[]actual = manager.findLast();
        Assertions.assertArrayEquals(expected,actual);
    }
}