package lt.codeacademy.javaua5.lvl2.stream;

import java.util.List;

import lt.codeacademy.javaua5.lvl2.stream.model.Movie;

import static java.lang.System.out;

public class Task2 {

	private final List<Movie> movies = List.of(
			new Movie("Movie A", 2000, 3),
			new Movie("Movie B", 2002, 5),
			new Movie("Movie C", 2001, 5),
			new Movie("Movie D", 1987, 1),
			new Movie("Movie E", 2020, 2),
			new Movie("Movie F", 2012, 4),
			new Movie("Movie G", 2010, 4)
	);

	public Task2() {
		getMovies().forEach(out::println);
	}

	public List<Movie> getMovies() {
		return this.movies;
	}
}
