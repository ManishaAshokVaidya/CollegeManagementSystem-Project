package MyPack.CollegeManagementSystem.Service;

import java.util.List;

import MyPack.CollegeManagementSystem.Model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService 
{
	//to save new Course
	public Course saveCourse(Course course);
	
	//to update Course
	public Course updateCourse(Course Course);
	
	//to fetch all Course from database
	
	public List<Course> findallCourses();
	
	//to delete Course
	public void deleteCourse(long CourseId);
	
}



