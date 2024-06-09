import java.util.HashSet;

public class Exam {
	/**
	 * @representationObject
	 */
	private HashSet<Room> rooms;

	
	/**
	 * @post | getRooms().isEmpty()
	 */
	public Exam() {
		rooms = new HashSet<>();
	}
	
	public HashSet<Room> getRooms() {
		return new HashSet<Room> (rooms);
	}
}
