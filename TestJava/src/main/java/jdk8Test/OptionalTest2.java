package jdk8Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee1 = new Employee();
        employee1.setName("lisi");

        Company company = new Company();
        company.setName("company");

        List<Employee> employees = Arrays.asList(employee,employee1);
        company.setEmployees(employees);

        List<Employee> list = company.getEmployees();

        System.out.println(list.get(1).getName());

        Optional<Company> optionalCompany = Optional.ofNullable(company);

        System.out.println(optionalCompany.map(theCompany -> theCompany.getEmployees()).
                orElse(Collections.emptyList()).get(0).getName());
    }

}
