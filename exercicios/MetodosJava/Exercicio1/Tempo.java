package MetodosJava.Exercicio1;

import java.time.format.DateTimeFormatter;

import static java.time.LocalTime.now;

public class Tempo {

    public static int horaAtual(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        return Integer.parseInt(dtf.format(now()));
    }

}
