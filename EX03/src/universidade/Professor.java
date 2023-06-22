package universidade;

public class Professor {

	private int id;
	private String departamento;

	public Professor(){
		this.id = 0;
		this.departamento = "";
	}

	public Professor(int id, String departamento){
		this.id = id;
		this.departamento = departamento;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartamento() {
		return this.departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento; 
	}

}
