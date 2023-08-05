package MyPack.CollegeManagementSystem.Service;

import java.util.List;

import MyPack.CollegeManagementSystem.Model.Exam;

import org.springframework.stereotype.Service;

@Service
public interface ExamService 
{
	//to save new exam
		public Exam saveExam(Exam exam);
		
		//to update exam
		public Exam updateExam(Exam exam);
		
		//to fetch all exam from database
		
		public List<Exam> findallExam();
		
		//to delete exam
		public void deleteExam(long ExamId);

}
