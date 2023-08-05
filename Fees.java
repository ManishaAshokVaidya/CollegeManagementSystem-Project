package MyPack.CollegeManagementSystem.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Fees 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String Studname;
	private String Year;
	private String Dept;
	private Long Fee;
	private Long Paid;
	private Long Due;
	private String Enddate;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "Fees")
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getStudname() {
		return Studname;
	}
	public void setStudname(String studname) {
		Studname = studname;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Long getFee() {
		return Fee;
	}
	public void setFee(Long fee) {
		Fee = fee;
	}
	public Long getPaid() {
		return Paid;
	}
	public void setPaid(Long paid) {
		Paid = paid;
	}
	public Long getDue() {
		return Due;
	}
	public void setDue(Long due) {
		Due = due;
	}
	
	public String getEnddate() {
		return Enddate;
	}
	public void setEnddate(String enddate) {
		Enddate = enddate;
	}
	public Fees(Long id, String studname, String year, String dept, Long fee, Long paid, Long due, String enddate) {
		super();
		Id = id;
		Studname = studname;
		Year = year;
		Dept = dept;
		Fee = fee;
		Paid = paid;
		Due = due;
		Enddate = enddate;
	}
	public Fees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
