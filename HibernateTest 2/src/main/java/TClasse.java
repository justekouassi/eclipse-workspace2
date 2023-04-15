
public  class TClasse {
	private String codeCl;
    private Integer effectif;
	private String libelle;
	
	public TClasse() {
		
	}
	public TClasse(String codeCl, Integer effectif, String libelle) {
		this.codeCl=codeCl;
		this.effectif=effectif;
		this.libelle=libelle;
	}
	
	public void setCodeCl(String codeCl) {
		this.codeCl=codeCl;
	}
	public void setEffectif(Integer effectif) {
		this.effectif=effectif;
	}
	public void setLibelle(String libelle) {
		this.libelle=libelle;
	}
	public String getCodeCl() {
		return this.codeCl;
	}
	public Integer getEffectif() {
		return this.effectif;
	}
	public String getLibelle() {
		return this.libelle;
	}
	
}
	



