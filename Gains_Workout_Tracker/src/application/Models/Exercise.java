package application.Models;

import java.sql.Date;

public abstract class Exercise {
	public abstract String toString();
	
	/** @return the id */ 
	public int getId() {
		return id;
	}
	
	/** @param id the id to set */ 
	public void setId(int id) {
		this.id = id;
	}
	
	/** @return the username */
	public String getUsername() {
		return username;
	}
	
	/** @param username the username to set */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/** @return the workoutName */
	public String getWorkoutName() {
		return workoutName;
	}
	
	/** @param workoutName the workoutName to set */
	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}
	
	/** @return the difficulty */
	public String getDifficulty() {
		return difficulty;
	}
	
	/** @param difficulty the difficulty to set */
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	/** @return the duration */
	public String getDuration() {
		return duration;
	}
	
	/** @param avgSetDuration the duration to set */
	public void setDuration(String avgSetDuration) {
		this.duration = avgSetDuration;
	}
	
	/** @return the workoutDate */
	public Date getWorkoutDate() {
		return workoutDate;
	}
	
	/** @param workoutDate the workoutDate to set */
	public void setWorkoutDate(Date workoutDate) {
		this.workoutDate = workoutDate;
	}
	
	protected int id;
	private String duration;
	private String username;
	private String workoutName;
	private String difficulty;		
	private Date workoutDate;
}
