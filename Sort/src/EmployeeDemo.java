import java.util.Arrays;

public class EmployeeDemo {

    public static void main(String[] args) {


        Employee[]  employee = {

                new Employee(50, "Matthias", 2500, "CO"),
                new Employee(5, "David", 3000, "Sales"),
                new Employee(3, "Stephan", 8000, "Management"),
                new Employee(23, "Elias", 6000, "Sales"),
                new Employee(4, "Olli", 5000, "DEVEL")
        };

        Arrays.sort(employee);
        System.out.println(Arrays.toString(employee));
    }
}
