package teste;

import java.util.ArrayList;
import universidade.*;

public class AplicacaoTestaUni {
    public static void main(String args[]) {
        
        final float LIMITE_ALUNOS_POR_MONITORES = 10.0f;
        final int NUM_ALUNOS_TURMA = 44;
        
        Professor prof1 = new Professor(144795, "Botânica");
        ArrayList<Monitor> monitores = new ArrayList<Monitor>();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        
        Monitor m1 = new Monitor(5, true);
        monitores.add(m1);
        monitores.add(new Monitor(3, false));
        
        for (int i=0; i<NUM_ALUNOS_TURMA; i++)
            alunos.add(new Aluno(i, (i/10.0f)+4.0f));
        
        Turma t1 = new Turma(prof1, monitores, alunos);
        
        int nAlunos = t1.getNumAlunos();
        int nMonitores = t1.getNumMonitores();        
        if(nMonitores != 0) {
			float razaoAlunosMonitores = nAlunos / nMonitores;
            if(razaoAlunosMonitores > LIMITE_ALUNOS_POR_MONITORES)
                System.out.println("Precisa de mais monitores.");
            else
                System.out.println("Quantidade de monitores suficiente.");
        }
        
        Professor prof2 = new Professor();
        prof2.setId(12000);
        prof2.setDepartamento("Genetica");
        
        Turma t2 = new Turma();
        t2.setProfessor(prof2);
        t2.setMonitores(monitores);
        t2.setAlunos(alunos);
        
        Aluno aluno1 = new Aluno(340993,8.5f);
        aluno1.aumentaIndiceDesempenho(0.5f);
        aluno1.diminuiIndiceDesempenho(0.3f);
        aluno1.imprime();
        t2.adicionaAluno(aluno1);
        
        t2.adicionaAluno(new Aluno(378941,9.2f));
        t2.removeAluno();
        t2.imprimeAlunos();
    }
}