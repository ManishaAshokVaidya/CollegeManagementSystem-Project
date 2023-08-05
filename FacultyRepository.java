package MyPack.CollegeManagementSystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MyPack.CollegeManagementSystem.Model.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Faculty save(Faculty faculty);

    List<Faculty> findAll();

    void deleteById(long facultyId);
}

