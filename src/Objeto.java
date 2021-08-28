
public class Objeto 
{
	String referencia;
	String evidencia;
	String fatorEvidencia;
	Integer mediaEvidencia;
	String refProcesso;
	
	public Objeto(String referencia, String evidencia, String fatorEvidencia, Integer mediaEvidencia, String refProcesso)
	{
		this.referencia = referencia;
        this.evidencia = evidencia;
        this.fatorEvidencia = fatorEvidencia;
        this.mediaEvidencia = mediaEvidencia;
        this.refProcesso = refProcesso;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getEvidencia() {
		return evidencia;
	}

	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}

	public String getFatorEvidencia() {
		return fatorEvidencia;
	}

	public void setFatorEvidencia(String fatorEvidencia) {
		this.fatorEvidencia = fatorEvidencia;
	}

	public Integer getMediaEvidencia() {
		return mediaEvidencia;
	}

	public void setMediaEvidencia(Integer mediaEvidencia) {
		this.mediaEvidencia = mediaEvidencia;
	}

	public String getRefProcesso() {
		return refProcesso;
	}

	public void setRefProcesso(String refProcesso) {
		this.refProcesso = refProcesso;
	}
	
}
