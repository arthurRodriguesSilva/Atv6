//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[15];

        funcionarios[0] = new Desenvolvedor("Arthur", 5000, 5);
        funcionarios[1] = new Desenvolvedor("Lucas", 5000, 4);
        funcionarios[2] = new Desenvolvedor("Bruno", 5000, 3);
        funcionarios[3] = new Desenvolvedor("Fernanda", 5000, 2);
        funcionarios[4] = new Desenvolvedor("João", 5000, 1);
        funcionarios[5] = new Gerente("Thauany", 8000, 1000);
        funcionarios[6] = new Gerente("Mariana", 8000, 1200);
        funcionarios[7] = new Gerente("Camila", 8000, 900);
        funcionarios[8] = new Gerente("Pedro", 8000, 1500);
        funcionarios[9] = new Gerente("Larissa", 8000, 1100);
        funcionarios[10] = new Estagiario("Rafael", 2000);
        funcionarios[11] = new Estagiario("Isabela", 2000);
        funcionarios[12] = new Estagiario("Carolina", 2000);
        funcionarios[13] = new Estagiario("Mateus", 2000);
        funcionarios[14] = new Estagiario("Beatriz", 2000);


        for (Funcionario funcionario : funcionarios) {
            System.out.print("Funcionário : " + funcionario.getNome() + " - Cargo: " + funcionario.getCargo() + " - " );
            funcionario.calcularSalario();
        }

    }
}