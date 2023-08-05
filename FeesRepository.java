package MyPack.CollegeManagementSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import MyPack.CollegeManagementSystem.Model.Fees;

public interface FeesRepository extends JpaRepository<Fees, Long>
{
	

}
