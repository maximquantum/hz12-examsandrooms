import java.util.HashSet;

/**
 * @invar | getExams().stream().allMatch( e -> e.getRooms().contains(this))
 * 
 */
public class Room {
	/**
	 * @representationObject
	 * @peerObjects
	 * @invar | exams != null
	 * @invar | exams.stream().allMatch( e -> e != null)
	 * @invar | exams.stream().allMatch( e -> e.rooms.contains(this))
	 */
	HashSet<Exam> exams;
	
	/**
	 * @post | getExams().isEmpty()
	 */
	public Room() {
		exams = new HashSet<>();
	}
	
	public HashSet<Exam> getExams() {
		return new HashSet<Exam> (exams);
	}
	
	/**
	 * @modifies | this
	 * @pre | exam != null
	 * @post | getExams().contains(exam)
	 */
	public void addExam(Exam exam) {
		exams.add(exam);
		exam.rooms.add(this);
	}
	
	/**
	 * @modifies | this
	 * @pre | getExams().contains(exam)
	 * @post | ! getExams().contains(exam)
	 */
	public void removeExam(Exam exam) {
		exams.remove(exam);
		exam.rooms.remove(this);
	}
}
