package MyPack.CollegeManagementSystem.Service.Impl;

import java.util.List;

import MyPack.CollegeManagementSystem.Model.Faculty;
import MyPack.CollegeManagementSystem.Service.FacultyService;
import MyPack.CollegeManagementSystem.dao.FacultyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyServiceImpl implements FacultyService
{
	private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

	@Override
	public Faculty saveFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepository.save(faculty);
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepository.save(faculty);
	}

	@Override
	public List<Faculty> findallFaculties() 
	{
		// TODO Auto-generated method stub
		return facultyRepository.findAll();
	}

	@Override
	public void deleteFaculty(long facultyId) 
	{
		// TODO Auto-generated method stub
		facultyRepository.deleteById(facultyId);
		
		
	}

	

}
