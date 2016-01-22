package videoclub;

public enum GameGenre {
	
	ACTION("Action"), ADVENTURE("Adventure"), STRATEGY("Strategy"), SPORT("Sport"), RACING("Racing");
	
	private final String name;

	private GameGenre(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}	
}
