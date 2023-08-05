package MyPack.CollegeManagementSystem.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="attendance")
public class Attendance 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String studname;
	private String Year;
	private String Dept;
	public String Month;
	private int Totaldays;
	private int NoOfdayspresent;
	private int NoOfdaysabsent;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "Attendance")
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
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
	
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public int getTotaldays() {
		return Totaldays;
	}
	public void setTotaldays(int totaldays) {
		Totaldays = totaldays;
	}
	public int getNoOfdayspresent() {
		return NoOfdayspresent;
	}
	public void setNoOfdayspresent(int noOfdayspresent) {
		NoOfdayspresent = noOfdayspresent;
	}
	public int getNoOfdaysabsent() {
		return NoOfdaysabsent;
	}
	public void setNoOfdaysabsent(int noOfdaysabsent) {
		NoOfdaysabsent = noOfdaysabsent;
	}
	
	public Attendance (Long id, String studname, String year, String dept, String month, int totaldays,
			int noOfdayspresent, int noOfdaysabsent) {
		super();
		Id = id;
		this.studname = studname;
		Year = year;
		Dept = dept;
		Month = month;
		Totaldays = totaldays;
		NoOfdayspresent = noOfdayspresent;
		NoOfdaysabsent = noOfdaysabsent;
	}
	public Attendance () {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}



