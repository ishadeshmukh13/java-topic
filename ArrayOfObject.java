
class Employee {

    int id;
    String name;
    int salary;

}

class EmployeeData {

    public static void main(String ab[]) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "ish";
        e1.salary = 20000;

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "yash";
        e2.salary = 30000;

        Employee e3 = new Employee();
        e3.id = 3;
        e3.name = "yashi";
        e3.salary = 40000;

        Employee employeeData[] = new Employee[3];
        employeeData[0] = e1;
        employeeData[1] = e2;
        employeeData[2] = e3;

        for (int i = 0; i < 3; i++) {
            System.out.println(employeeData[i].id + " " + employeeData[i].name + " " + employeeData[i].salary);
        }


        //for each
        for(Employee n:employeeData){
            System.out.println(n.id + " " + n.name + " " + n.salary);
        }

    }
}
