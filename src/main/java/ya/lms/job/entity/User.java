package ya.lms.job.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "YAUser")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UserId")
	private String userId; // userId Varchar
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private String password;
	@Column(name = "Email")
	private String email;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "User-Role")
	private String userRole;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "Profile Picture")
	private String profilePic;
	@Column(name = "CreatedAT")
	private Date createdAt;
	@Column(name = "UpdatedAT")
	private Date updatedAt;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
	private Student student;

}
