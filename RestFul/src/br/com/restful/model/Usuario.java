package br.com.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe responsavel por conter os atributos do objeto Usuario
 * @author renato
 *
 */

/*
 * Anotação obrigatoria, do contrario não funcionao web service
 */
@XmlRootElement
public final class Usuario {
	
	private Integer id;
	private Integer idPerfil;
    private Integer idRedeSocial;
    private Integer idEndereco;
    private Integer idTelefone;

    private String dsNome;
    private String dsGenero;
    private String dataNascimento;
    private String dsLogin;
    private String dsSenha;
    private String dsEmail;
    private String dsTelefone;
    
    
    
    /*
     * ctrl + 3 + ggas
     * Metodos Getters and Setters
     */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	public Integer getIdRedeSocial() {
		return idRedeSocial;
	}
	public void setIdRedeSocial(Integer idRedeSocial) {
		this.idRedeSocial = idRedeSocial;
	}
	public Integer getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getDsNome() {
		return dsNome;
	}
	public void setDsNome(String dsNome) {
		this.dsNome = dsNome;
	}
	public String getDsGenero() {
		return dsGenero;
	}
	public void setDsGenero(String dsGenero) {
		this.dsGenero = dsGenero;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDsLogin() {
		return dsLogin;
	}
	public void setDsLogin(String dsLogin) {
		this.dsLogin = dsLogin;
	}
	public String getDsSenha() {
		return dsSenha;
	}
	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}
	public String getDsEmail() {
		return dsEmail;
	}
	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
	public String getDsTelefone() {
		return dsTelefone;
	}
	public void setDsTelefone(String dsTelefone) {
		this.dsTelefone = dsTelefone;
	}
	
	
	/*
	 *  ctrl + 3 + gts
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", idPerfil=" + idPerfil + ", idRedeSocial=" + idRedeSocial + ", idEndereco="
				+ idEndereco + ", idTelefone=" + idTelefone + ", dsNome=" + dsNome + ", dsGenero=" + dsGenero
				+ ", dataNascimento=" + dataNascimento + ", dsLogin=" + dsLogin + ", dsSenha=" + dsSenha + ", dsEmail="
				+ dsEmail + ", dsTelefone=" + dsTelefone + "]";
	}
	
	
    /*
     * Gerar o 'hashCode'  and 'equals' =  ctrl + 3 + ghc
     * 
     */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((dsEmail == null) ? 0 : dsEmail.hashCode());
		result = prime * result + ((dsGenero == null) ? 0 : dsGenero.hashCode());
		result = prime * result + ((dsLogin == null) ? 0 : dsLogin.hashCode());
		result = prime * result + ((dsNome == null) ? 0 : dsNome.hashCode());
		result = prime * result + ((dsSenha == null) ? 0 : dsSenha.hashCode());
		result = prime * result + ((dsTelefone == null) ? 0 : dsTelefone.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idEndereco == null) ? 0 : idEndereco.hashCode());
		result = prime * result + ((idPerfil == null) ? 0 : idPerfil.hashCode());
		result = prime * result + ((idRedeSocial == null) ? 0 : idRedeSocial.hashCode());
		result = prime * result + ((idTelefone == null) ? 0 : idTelefone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (dsEmail == null) {
			if (other.dsEmail != null)
				return false;
		} else if (!dsEmail.equals(other.dsEmail))
			return false;
		if (dsGenero == null) {
			if (other.dsGenero != null)
				return false;
		} else if (!dsGenero.equals(other.dsGenero))
			return false;
		if (dsLogin == null) {
			if (other.dsLogin != null)
				return false;
		} else if (!dsLogin.equals(other.dsLogin))
			return false;
		if (dsNome == null) {
			if (other.dsNome != null)
				return false;
		} else if (!dsNome.equals(other.dsNome))
			return false;
		if (dsSenha == null) {
			if (other.dsSenha != null)
				return false;
		} else if (!dsSenha.equals(other.dsSenha))
			return false;
		if (dsTelefone == null) {
			if (other.dsTelefone != null)
				return false;
		} else if (!dsTelefone.equals(other.dsTelefone))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idEndereco == null) {
			if (other.idEndereco != null)
				return false;
		} else if (!idEndereco.equals(other.idEndereco))
			return false;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		if (idRedeSocial == null) {
			if (other.idRedeSocial != null)
				return false;
		} else if (!idRedeSocial.equals(other.idRedeSocial))
			return false;
		if (idTelefone == null) {
			if (other.idTelefone != null)
				return false;
		} else if (!idTelefone.equals(other.idTelefone))
			return false;
		return true;
	}

}
