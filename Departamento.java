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
	public int getIdDepartamento() {
	    return idDepartamento;
	}
	
	public void setIdDepartamento(int idDepartamento) {
	    this.idDepartamento = idDepartamento;
	}
	
	public int getValorMaximo() {
	    return valorMaximo;
	}
	
	public void setValorMaximo(int valorMaximo) {
	    this.valorMaximo = valorMaximo;
	}
	public String getNomeDepartamento() {
	    return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
	    this.nomeDepartamento = nomeDepartamento;
	}
	public int getAdmId() {
		return admId;
	}
	public void setAdmId(int admId) {
		this.admId = admId;
	}
	
	@Override
	public String toString() {
	    return "Departamento [Id Departamento = " + getIdDepartamento() +
	                         "Nome Departamento = " + getNomeDepartamento() + 
	                         "Valor Máximo = " + getValorMaximo() + "]";
	}
}