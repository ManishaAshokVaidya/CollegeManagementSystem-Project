package MyPack.CollegeManagementSystem.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyPack.CollegeManagementSystem.Model.Fees;
import MyPack.CollegeManagementSystem.Service.FeesService;
import MyPack.CollegeManagementSystem.dao.FeesRepository;

@Service
public class FeesServiceImpl implements FeesService
{
	@Autowired
	private FeesRepository feesRepository;
	@Override
	public Fees saveFees(Fees fee) 
	{
		
		return this.feesRepository.save(fee);
	}

	@Override
	public Fees updateFees(Fees fee)
	{
		
		return this.feesRepository.save(fee);
	}

	@Override
	public void deleteFees(Long id)
	{
		this.feesRepository.deleteById(id);
		
	}

	@Override
	public List<Fees> findallFees() 
	{
		
		return this.feesRepository.findAll();
	}

}

