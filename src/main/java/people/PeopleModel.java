package people;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tasks.TasksCompany;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_cadastros")
public class PeopleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String job;
    private double salary;
    private String city;

    //@ManyToOne an employee has only task
    @ManyToOne
    @JoinColumn(name = "tasks_id")//Juntando as duas colunas, Foreign key
    private TasksCompany tasks;

    PeopleModel(String name, int age, String job, double salary, String city) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.city = city;
    }

}
