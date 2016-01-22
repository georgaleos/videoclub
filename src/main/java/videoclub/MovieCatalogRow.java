package videoclub;

/**
 * 
 * @author georg
 *
 */
public class MovieCatalogRow implements CatalogRow{

	private Movie movie;
	private Integer instancesNumber;
	private Integer availableInstancesNumber;

	public MovieCatalogRow(Movie movie, Integer instancesNumber, Integer availableInstancesNumber) {
		super();
		this.movie = movie;
		this.instancesNumber = instancesNumber;
		this.availableInstancesNumber = availableInstancesNumber;
	}

	@Override
	public String toString() {
		return "MovieCatalogRow [movie=" + movie + ", instancesNumber=" + instancesNumber
				+ ", availableInstancesNumber=" + availableInstancesNumber + "]";
	}

}
