package MyPack.CollegeManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MyPack.CollegeManagementSystem.Model.Course;

public interface CourseRepository extends JpaRepository<Course,Long> 
{
	Course save(Course course);

	List<Course> findAll();

	void deleteById(long courseId);

}
