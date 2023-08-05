
package MyPack.CollegeManagementSystem.Model;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "course_id")
    private String courseId;
    
    private String examName;
    
    @Temporal(TemporalType.DATE)
    private Date examDate;
    
    private String startTime;
    private String endTime;
    
    @Column(name = "exam_duration")
    private int examDuration;
    
    private String examVenue;
    
    @Column(name = "maximum_marks")
    private int maximumMarks;
    
   
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCourseId() {
        return courseId;
    }
    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    public String getExamName() {
        return examName;
    }
    
    public void setExamName(String examName) {
        this.examName = examName;
    }
    
    public Date getExamDate() {
        return examDate;
    }
    
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
    
    public String getStartTime() {
        return startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
}
    
    public int getExamDuration() {
        return examDuration;
    }
    
    public void setExamDuration(int examDuration) {
        this.examDuration = examDuration;
    }
    
    public String getExamVenue() {
        return examVenue;
    }
    
    public void setExamVenue(String examVenue) {
        this.examVenue = examVenue;
    }
    
    public int getMaximumMarks() {
        return maximumMarks;
    }
    
    public void setMaximumMarks(int maximumMarks) {
        this.maximumMarks = maximumMarks;
    }
    
    
	public Exam(Long id, String courseId, String examName, Date examDate, String startTime, String endTime,
			int examDuration, String examVenue, int maximumMarks, int passingMarks, List<Course> courses) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.examName = examName;
		this.examDate = examDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.examDuration = examDuration;
		this.examVenue = examVenue;
		this.maximumMarks = maximumMarks;
		
	}
    
    
    
}
