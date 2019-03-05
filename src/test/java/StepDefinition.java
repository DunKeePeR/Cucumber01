import cucumber.api.PendingException;
import cucumber.api.java.ru.*;

public class StepDefinition {
    @Дано("^пользователь вводит число А равное (\\d+)$")
    public void пользовательВводитЧислоАРавное(int arg1) {
        System.out.printf("Пользователь ввел число А = %d\n", arg1);
    }

    @Дано("^пользователь вводит число Б равное (\\d+)$")
    public void пользовательВводитЧислоБРавное(int arg1) {
        System.out.printf("Пользователь ввел число Б = %d\n", arg1);
    }

    @Тогда("^система выдает сумму (\\d+) и (\\d+)$")
    public void системаВыдаетСуммуИ(int arg1, int arg2) {
        int x;
        x = arg1 + arg2;
        System.out.printf("Сумма чисел равна %d\n", x);
    }
}
