package MyPack.CollegeManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import MyPack.CollegeManagementSystem.Model.Course;
import MyPack.CollegeManagementSystem.Service.Impl.CourseServiceImpl;

@RestController
@RequestMapping("/course")
@CrossOrigin("*")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseServiceImpl;

    @PostMapping("/saveCourse")
    public ResponseEntity<Course> saveCourse(@RequestBody Course course) {
        Course savedCourse = courseServiceImpl.saveCourse(course);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }

    @GetMapping("/getcourse")
    public ResponseEntity<List<Course>> findAllCourses() {
        List<Course> allCourses = courseServiceImpl.findallCourses();
        return new ResponseEntity<>(allCourses, HttpStatus.OK);
    }

    @PutMapping("updatecourse")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        Course updatedCourse = courseServiceImpl.updateCourse(course);
        return new ResponseEntity<>(updatedCourse, HttpStatus.OK);
    }

    @DeleteMapping("/deletecourse")
    public ResponseEntity<String> deleteCourse(@RequestParam long CourseId) {
        courseServiceImpl.deleteCourse(CourseId);
        return new ResponseEntity<>("course deleted", HttpStatus.OK);
    }
}
