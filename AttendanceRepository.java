package MyPack.CollegeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MyPack.CollegeManagementSystem.Model.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>
{
	

}


