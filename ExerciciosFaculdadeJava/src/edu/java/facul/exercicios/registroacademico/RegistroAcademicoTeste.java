package edu.java.facul.exercicios.registroacademico;

public class RegistroAcademicoTeste {

	public static void main(String[] args) {
		
		//Data d1 = new Data(1,1,1);
		//System.out.println(d1.toString());
			
		//Endereco end1 = new Endereco("1","1","1",1,1);
		//System.out.println(end1.toString());
			
			Data d1 = new Data(1,11,1990);
			Endereco end1 = new Endereco("X","Y","Z",11,34900);		
			RegistroAcademico al1 = new RegistroAcademico("Paula","001", d1, false,2010,end1);
			//al1.mostrarDados();
			
			RegistroAcademico al2 = new RegistroAcademico("Lorena","002", new Data(21,10,1980), true,2009,new Endereco("B","C","D",3,46789));

			RegistroAcademico al3 = new RegistroAcademico("Maria","003", new Data(2,7,1981), true,2008,new Endereco("E","F","G",5,20000));

			RegistroAcademico al4 = new RegistroAcademico("Lurdes","004", new Data(19,8,1977), false,2008,new Endereco("H","I","J",100,12345));
			
			
			RegistroAcademico alunos[] = new RegistroAcademico[4];
			
			alunos[0] = al1;
			alunos[1] = al2;
			alunos[2] = al3;
			alunos[3] = al4;
			
			for(int i=0;i<=3;i++) {
				alunos[i].mostrarDados();
			}
			
			

	}

}



