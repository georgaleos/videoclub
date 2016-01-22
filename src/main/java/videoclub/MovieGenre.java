package videoclub;

public enum MovieGenre {
	
	COMEDY("Comedy"), ACTION("Action"), ADVENTURE("Adventure"), ROMANCE("Romance"), ANIMATION("Animation"), FANTASY("Fantasy");
	
	private final String name;

	private MovieGenre(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	
}
