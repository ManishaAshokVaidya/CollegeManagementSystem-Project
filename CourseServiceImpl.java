package MyPack.CollegeManagementSystem.Service.Impl;

import java.util.List;


import MyPack.CollegeManagementSystem.Model.Course;
import MyPack.CollegeManagementSystem.Service.CourseService;
import MyPack.CollegeManagementSystem.dao.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CourseServiceImpl implements CourseService
{
	private final CourseRepository courseRepository;
	
	@Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> findallCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(courseId);
	}

}
