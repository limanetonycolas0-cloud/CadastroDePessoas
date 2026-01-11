package tasks;
import jakarta.persistence.*;
import people.PeopleModel;

import java.util.List;

@Entity
@Table(name = "tb_hobbies")
public class TasksCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskName;
    private int deadLine;
    private String difficulty;

    //One task can be assigned to many employees
    @OneToMany(mappedBy = "tasks")
    private List<PeopleModel> employees;

    TasksCompany() {
    }

    TasksCompany(Long id, String taskName, int deadLine, String difficulty) {
        this.id = id;
        this.taskName = taskName;
        this.deadLine = deadLine;
        this.difficulty = difficulty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
