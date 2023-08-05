package MyPack.CollegeManagementSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import MyPack.CollegeManagementSystem.Model.Attendance;
@Service
public interface AttendanceService 
{
	public Attendance saveAttendance(Attendance attendance);
	public Attendance updateAttendance(Attendance attendance);
	public void deleteAttendance(Long id);
    public List<Attendance> findallAttendances();


}
