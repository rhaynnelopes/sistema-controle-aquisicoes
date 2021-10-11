public class Departamento
{
	private int idDepartamento;
	private int valorMaximo;
	private String nomeDepartamento;
	private int admId;
	
	public Departamento(int idDepartamento, int valorMaximo, String nomeDepartamento, int admId) {
	    this.idDepartamento = idDepartamento;
	    this.valorMaximo = valorMaximo;
	    this.nomeDepartamento = nomeDepartamento;
        this.admId = admId;
	}
	
	public int getAdmId() {
		return admId;
	}
	public void setAdmId(int admId) {
		this.admId = admId;
	}
	
}