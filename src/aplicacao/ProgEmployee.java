package aplicacao;

import entidades.Employee;

import java.util.Scanner;

public class ProgEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee func = new Employee();
        System.out.println("Entre com os dados do funcionário:");
        System.out.print("Nome: ");
        func.setName(sc.nextLine());
        System.out.print("Salario Bruto: ");
        func.setGrossSalary(sc.nextDouble());
        System.out.print("Taxa: ");
        func.setTax(sc.nextDouble());
        System.out.println(func);
        System.out.println("Qual a porcentagem de aumento?: ");
        double porcentagem = sc.nextDouble();
        func.increaseSalary(porcentagem);
        System.out.println("Dados atualizados: "+ func);
        Employee.felizAniversário(func);
    }
}
