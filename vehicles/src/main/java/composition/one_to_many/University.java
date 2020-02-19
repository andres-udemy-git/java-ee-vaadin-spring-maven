package composition.one_to_many;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class University {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int universityId;

    private String name;

    @OneToMany(mappedBy = "university")
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public University(String name) {
        this();
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
        s.setUniversity(this);
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
        students.stream().forEach(s -> s.setUniversity(this));
    }
}
