package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;

	private Department Department;

	public Seller() {

	}

	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department Department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.Department = Department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDeparttament() {
		return Department;
	}

	public void setDeparttament(Department Department) {
		this.Department = Department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("========================================\n");
	    sb.append(String.format(" ID:           %d\n", id));
	    sb.append(String.format(" Nome:         %s\n", name));
	    sb.append(String.format(" Email:        %s\n", email));
	    sb.append(String.format(" Nascimento:   %s\n", birthDate != null ? birthDate : "N/A"));
	    sb.append(String.format(" Salário Base: R$ %.2f\n", baseSalary != null ? baseSalary : 0.0));
	    sb.append(String.format(" Departmento: %s\n", 
	            Department != null ? Department.getName() + " (ID: " + Department.getId() + ")" : "N/A"));
	    sb.append("========================================");
	    return sb.toString();
	}

}
