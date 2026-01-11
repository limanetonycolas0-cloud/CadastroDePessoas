package people;
import jakarta.persistence.*;
import tasks.TasksCompany;
import java.util.List;

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


    PeopleModel(){
    }

    PeopleModel(String name, int age, String job, double salary, String city){
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
