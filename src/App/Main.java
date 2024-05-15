package App;

import com.zyang.baseDate.Employee;
import com.zyang.baseDate.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("1", "zhaozhongyang");
       // person.getPerson_code();
        System.out.println(person.getPerson_code());
       // person.getPerson_name();
        System.out.println(person.getPerson_name());

        Employee employee = new Employee();
        employee.setUser_code(person.getPerson_code());
        System.out.println(employee.getUser_code());

        return;
    }
    //https://github.com/pandatti/git_demo.git
}