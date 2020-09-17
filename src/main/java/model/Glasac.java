package model;

public class Glasac {
	private Integer id;
	
	private String ime;
	
	private String prezime;
	
	private String imeOca;
	
	private String datumRodjenja;
	
	private String izbornaJedinica;
	
	private String glasDobavio;
	
	private int iznosPlacanja;
	
	public Glasac() {
		super();
	}

	public Glasac(Integer id, String ime, String prezime, String imeOca, String datumRodjenja, String izbornaJedinica,
			String glasDobavio, int iznosPlacanja) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.imeOca = imeOca;
		this.datumRodjenja = datumRodjenja;
		this.izbornaJedinica = izbornaJedinica;
		this.glasDobavio = glasDobavio;
		this.iznosPlacanja = iznosPlacanja;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getImeOca() {
		return imeOca;
	}

	public void setImeOca(String imeOca) {
		this.imeOca = imeOca;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getIzbornaJedinica() {
		return izbornaJedinica;
	}

	public void setIzbornaJedinica(String izbornaJedinica) {
		this.izbornaJedinica = izbornaJedinica;
	}

	public String getGlasDobavio() {
		return glasDobavio;
	}

	public void setGlasDobavio(String glasDobavio) {
		this.glasDobavio = glasDobavio;
	}

	public int getIznosPlacanja() {
		return iznosPlacanja;
	}

	public void setIznosPlacanja(int iznosPlacanja) {
		this.iznosPlacanja = iznosPlacanja;
	}

	@Override
	public String toString() {
		return "Glasac [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", imeOca=" + imeOca + ", datumRodjenja="
				+ datumRodjenja + ", izbornaJedinica=" + izbornaJedinica + ", glasDobavio=" + glasDobavio
				+ ", iznosPlacanja=" + iznosPlacanja + "]";
	}
	
	

}
