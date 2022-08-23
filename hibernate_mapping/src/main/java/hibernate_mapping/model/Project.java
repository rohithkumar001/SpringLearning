package hibernate_mapping.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	@Id private int ProjectId;
	public Project(int projectId, String projectName) {
		super();
		ProjectId = projectId;
		this.projectName = projectName;
	}

	private String projectName;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Employee> employee;

	public int getProjectId() {
		return ProjectId;
	}

	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Employee getEmployee() {
		return (Employee) employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = (Set<Employee>) employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ProjectId;
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
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
		Project other = (Project) obj;
		if (ProjectId != other.ProjectId)
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [ProjectId=" + ProjectId + ", projectName=" + projectName + ", employee=" + employee + "]";
	}
	
	
}
