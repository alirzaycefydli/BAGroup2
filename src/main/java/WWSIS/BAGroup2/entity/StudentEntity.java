package WWSIS.BAGroup2.entity;
import javax.persistence.*;



@Entity
@Table(name="students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="student_id")
    private int studentId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email", unique=true)
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="failed_login_attempts")
    private int failedLoginAttempts;

    @Column(name="is_blocked")
    private boolean isBlocked;
}