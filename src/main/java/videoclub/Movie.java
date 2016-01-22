package videoclub;

import java.util.List;
import java.util.Set;

public abstract class Movie {
	
	private String title;
	private Set<MovieGenre> genres;
	// TODO make directors, writes and actors objects
	private List<String> directors;
	private List<String> writers;
	private List<String> actors;
	private String productionCompany;
	private Integer productionYear;
	private Integer duration;
	
	public Movie(String title, Set<MovieGenre> genres, List<String> directors, List<String> writers,
			List<String> actors, String productionCompany, Integer productionYear, Integer duration) {
		super();
		this.title = title;
		this.genres = genres;
		this.directors = directors;
		this.writers = writers;
		this.actors = actors;
		this.productionCompany = productionCompany;
		this.productionYear = productionYear;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genres=" + genres + ", directors=" + directors + ", writers=" + writers
				+ ", actors=" + actors + ", productionCompany=" + productionCompany + ", productionYear="
				+ productionYear + ", duration=" + duration + "]";
	}
}
