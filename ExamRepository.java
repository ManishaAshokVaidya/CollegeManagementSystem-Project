package MyPack.CollegeManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MyPack.CollegeManagementSystem.Model.Exam;
@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> 
{
	Exam save(Exam exam);

	List<Exam> findAll();

	void deleteById(long examId);


}
