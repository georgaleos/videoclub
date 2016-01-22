package videoclub;

import java.util.Set;

public abstract class Game {
	
	private String title;
	private Set<GameGenre> genres;
	private String productionCompany;
	private Integer productionYear;
	
	public Game(String title, Set<GameGenre> genres, String productionCompany, Integer productionYear) {
		super();
		this.title = title;
		this.genres = genres;
		this.productionCompany = productionCompany;
		this.productionYear = productionYear;
	}

	@Override
	public String toString() {
		return "Game [title=" + title + ", genres=" + genres + ", productionCompany=" + productionCompany
				+ ", productionYear=" + productionYear + "]";
	}
}
