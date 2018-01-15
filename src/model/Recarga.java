package model;

import java.util.Date;

public class Recarga {

	private Integer idRecarga;
	private Integer codCartao;
	private Date data;
	private String status;

	public Recarga() {
		super();
	}

	public Recarga(Integer idRecarga, Integer codCartao, Date data, String status) {
		super();
		this.idRecarga = idRecarga;
		this.codCartao = codCartao;
		this.data = data;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Recarga [idRecarga=" + idRecarga + ", codCartao=" + codCartao + ", data=" + data + ", status=" + status
				+ "]";
	}

	public Integer getIdRecarga() {
		return idRecarga;
	}

	public void setIdRecarga(Integer idRecarga) {
		this.idRecarga = idRecarga;
	}

	public Integer getCodCartao() {
		return codCartao;
	}

	public void setCodCartao(Integer codCartao) {
		this.codCartao = codCartao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
