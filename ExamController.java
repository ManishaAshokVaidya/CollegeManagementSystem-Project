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

import MyPack.CollegeManagementSystem.Model.Exam;
import MyPack.CollegeManagementSystem.Service.Impl.ExamServiceImpl;

@RestController
@RequestMapping("/exam")
@CrossOrigin("*")
public class ExamController {

    @Autowired
    private ExamServiceImpl examServiceImpl;

    @PostMapping("/saveExam")
    public ResponseEntity<Exam> saveExam(@RequestBody Exam exam) {
        Exam savedExam = examServiceImpl.saveExam(exam);
        return new ResponseEntity<>(savedExam, HttpStatus.CREATED);
    }

    @GetMapping("/getexam")
    public ResponseEntity<List<Exam>> findAllExams() {
        List<Exam> allExams = examServiceImpl.findallExam();
        return new ResponseEntity<>(allExams, HttpStatus.OK);
    }

    @PutMapping("updateexam")
    public ResponseEntity<Exam> updateExam(@RequestBody Exam exam) {
        Exam updatedExam = examServiceImpl.updateExam(exam);
        return new ResponseEntity<>(updatedExam, HttpStatus.OK);
    }

    @DeleteMapping("/deleteexam")
    public ResponseEntity<String> deleteExam(@RequestParam long ExamId) {
        examServiceImpl.deleteExam(ExamId);
        return new ResponseEntity<>("exam deleted", HttpStatus.OK);
    }
}
