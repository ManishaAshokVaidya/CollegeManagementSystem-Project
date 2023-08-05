package MyPack.CollegeManagementSystem.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private int duration;
    private String assignedFaculty;
    private String courseSchedule;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getDuration() {
        return duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public String getAssignedFaculty() {
        return assignedFaculty;
    }
    
    public void setAssignedFaculty(String assignedFaculty) {
        this.assignedFaculty = assignedFaculty;
    }
    
    public String getCourseSchedule() {
        return courseSchedule;
    }
    
    public void setCourseSchedule(String courseSchedule) {
        this.courseSchedule = courseSchedule;
    }
    
   
    
    

	public Course(Long id, String title, String description, int duration, String assignedFaculty,
			String courseSchedule, Exam exam) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.assignedFaculty = assignedFaculty;
		this.courseSchedule = courseSchedule;
		
		
	}
    

    
}
