package masterSpringMvc.forms;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class ProfileForm implements Serializable{
	private static final long serialVersionUID = 4106107884437568206L;
	private String name;
	private Integer age;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "ProfileForm [name=" + name + ", age=" + age + ", email=" + email + ", birth=" + birth + "]";
	}
	
}
