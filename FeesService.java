package MyPack.CollegeManagementSystem.Service;

import java.util.List;

import MyPack.CollegeManagementSystem.Model.Fees;

public interface FeesService 
{
	public Fees saveFees(Fees fee);
	public Fees updateFees(Fees fee);
	public void deleteFees(Long id);
    public List<Fees> findallFees();


}
