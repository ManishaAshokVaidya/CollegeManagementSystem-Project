package MyPack.CollegeManagementSystem.Service;

import java.util.List;

import MyPack.CollegeManagementSystem.Model.Faculty;
import org.springframework.stereotype.Service;

@Service
public interface FacultyService 
{
	//to save new faculty
	public Faculty saveFaculty(Faculty faculty);
	
	//to update faculty
	public Faculty updateFaculty(Faculty faculty);
	
	//to fetch all faculty from database
	
	public List<Faculty> findallFaculties();
	
	//to delete faculty
	public void deleteFaculty(long FacultyId);
}
