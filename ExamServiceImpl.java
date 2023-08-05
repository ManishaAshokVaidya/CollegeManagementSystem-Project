package MyPack.CollegeManagementSystem.Service.Impl;

import java.util.List;

import MyPack.CollegeManagementSystem.Model.Exam;
import MyPack.CollegeManagementSystem.Service.ExamService;
import MyPack.CollegeManagementSystem.dao.ExamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService
{
	private final ExamRepository examRepository;

    @Autowired
    public ExamServiceImpl(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

	@Override
	public Exam saveExam(Exam exam) {
		// TODO Auto-generated method stub
		return examRepository.save(exam);
	}

	@Override
	public Exam updateExam(Exam exam) {
		// TODO Auto-generated method stub
		return examRepository.save(exam);
	}

	@Override
	public List<Exam> findallExam() {
		// TODO Auto-generated method stub
		return examRepository.findAll();
	}

	@Override
	public void deleteExam(long examId) {
		// TODO Auto-generated method stub
		examRepository.deleteById(examId);
	}

}
