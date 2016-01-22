package videoclub;

/**
 * 
 * @author georg
 *
 */
public class GameCatalogRow implements CatalogRow{

	private Game game;
	private Integer instancesNumber;
	private Integer availableInstancesNumber;

	public GameCatalogRow(Game game, Integer instancesNumber, Integer availableInstancesNumber) {
		super();
		this.game = game;
		this.instancesNumber = instancesNumber;
		this.availableInstancesNumber = availableInstancesNumber;
	}

	@Override
	public String toString() {
		return "GameCatalogRow [game=" + game + ", instancesNumber=" + instancesNumber + ", availableInstancesNumber="
				+ availableInstancesNumber + "]";
	}

}
