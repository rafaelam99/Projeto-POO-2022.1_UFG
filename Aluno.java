package poo2022_1.sistema_academico;
import java.util.Calendar;

/**
 * Espaço reservado para documentação de código
 * 
 * atributos
 * atributo matricula = matricula do aluno
 * atributo nascimento = data em que o aluno nasceu 
 * atributo conclusaoEM = ano em que o aluno se graduou no ensino medio
 * atributo curso = curso em que o aluno esta inscrito 
 * 
 * @author Rafaela Montes
 * 
 */

public class Aluno extends Pessoa {
    public int matricula;
    public Calendar nascimento;
    public int conclusaoEM;
    public String curso;



    public int matricula() {
        return matricula;
    }

    public Calendar nascimento() {
        return nascimento;
    }

    public int conclusaoEM() {
        return conclusaoEM;
    }

    public String curso() {
        return curso;
    }

   public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getConclusaoEM() {
        return conclusaoEM;
    }

    public void setConclusaoEM(int conclusaoEM) {
        this.conclusaoEM = conclusaoEM;
    }
  
}
