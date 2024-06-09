import java.util.HashSet;
/**
 * @invar | getRooms().stream().allMatch( e -> e.getExams().contains(this))
 */
public class Exam {
	/**
	 * @representationObject
	 * @peerObjects
	 * @invar | rooms != null
	 * @invar | rooms.stream().allMatch( r -> r != null)
	 * @invar | rooms.stream().allMatch( r -> r.exams.contains(this))
	 */
	HashSet<Room> rooms;

	
	/**
	 * @post | getRooms().isEmpty()
	 */
	public Exam() {
		rooms = new HashSet<>();
	}
	
	/**
	 * @peerObjects
	 */
	public HashSet<Room> getRooms() {
		return new HashSet<Room> (rooms);
	}
}
