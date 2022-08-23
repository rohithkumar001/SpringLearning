package hibernate_mapping.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="ProjectId")
	private Project project;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="phone")
	@OrderColumn(name="type")
	private List<Phone> phone;

	public long getEmpId() {
		return empId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		StringBuilder strbul=new StringBuilder();
        for(Phone str : phone)
        {
            strbul.append(str);
            strbul.append(",");
        }
        String str=strbul.toString();
        System.out.println("printing here"+str);
		this.phone = phone;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (empId ^ (empId >>> 32));
		result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (laptop == null) {
			if (other.laptop != null)
				return false;
		} else if (!laptop.equals(other.laptop))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + ", laptop=" + laptop + ", project="
				+ project + "]";
	}
	
	
	
	
	
}
