package MyPack.CollegeManagementSystem.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyPack.CollegeManagementSystem.Model.Attendance;
import MyPack.CollegeManagementSystem.Service.AttendanceService;
import MyPack.CollegeManagementSystem.dao.AttendanceRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepo;

    @Override
    public Attendance saveAttendance(Attendance attendance) {
        return this.attendanceRepo.save(attendance);
    }

    @Override
    public Attendance updateAttendance(Attendance attendance) {

        return this.attendanceRepo.save(attendance);
    }

    @Override
    public void deleteAttendance(Long id) {
        this.attendanceRepo.deleteById(id);
    }

    @Override
    public List<Attendance> findallAttendances() {
        return this.attendanceRepo.findAll();
    }
}
