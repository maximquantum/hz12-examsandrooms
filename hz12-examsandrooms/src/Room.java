import java.util.HashSet;

/**
 * 
 */
public class Room {
	/**
	 * @representationObject
	 * @invariant | exam != null
	 */
	private HashSet<Exam> exams;
	
	/**
	 * @post | getExams().isEmpty()
	 */
	public Room() {
		exams = new HashSet<>();
	}
	
	public HashSet<Exam> getExams() {
		return new HashSet<Exam> (exams);
	}
}
