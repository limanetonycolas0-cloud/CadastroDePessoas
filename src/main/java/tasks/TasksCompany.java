package tasks;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import people.PeopleModel;

import java.util.List;
@NoArgsConstructor
@Data
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


    TasksCompany(Long id, String taskName, int deadLine, String difficulty) {
        this.id = id;
        this.taskName = taskName;
        this.deadLine = deadLine;
        this.difficulty = difficulty;
    }

}
