package application.Models;

import java.sql.Date;

public class CardioTraining extends Exercise {
	/** For entering in new CardioTraining entry to database */
	public CardioTraining(String username, String workoutName, String difficulty,
			String duration, Date workoutDate) {
		setUsername(username);
		setWorkoutName(workoutName);
		setDifficulty(difficulty);
		setDuration(duration);
		setWorkoutDate(workoutDate);
	}
	
	/** For querying CardioTraining data from database */
	public CardioTraining(int id, String username, String workoutName, String difficulty, 
			String duration, Date workoutDate) {
		setId(id);
		setUsername(username);
		setWorkoutName(workoutName);
		setDifficulty(difficulty);
		setDuration(duration);
		setWorkoutDate(workoutDate);
	}
	
	@Override
	public String toString() {
		String data = 
				"Username: " + getUsername() +
				"\nWorkoutDate: " + getWorkoutDate() +
				"\nWorkoutName: " + getWorkoutName() + 
				"\nDifficulty: " + getDifficulty() + 
				"\nDuration: " + getDuration();
				
		// Adds id value if it exists
		if(getId() != 0) {
			return 	"ID: " + getId() + ", " + data;
		}
		return data;
	}

}
