import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");


        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3"};

        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test1() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");


        String[] expected = {"Фильм 3", "Фильм 2", "Фильм 1"};

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 5");


        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
