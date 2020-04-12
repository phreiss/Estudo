package br.com.estudo.Nasa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Nasa")
public class Nasa {
	@Id
	private Integer id;

	private String date;

	private String copyright;

	private String explanation;

	public Nasa() {}

	public Nasa(Integer id, String date, String copyright, String explanation) {
		this.id = id;
		this.date = date;
		this.copyright = copyright;
		this.explanation = explanation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

}