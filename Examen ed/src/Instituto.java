
public class Instituto {

	private String localidad;
	private int numClases;
	private boolean publico;
	private String nombreDirector;
	private String[]jefesDeEstudios=new String[3];
	
	Instituto() {
		this.jefesDeEstudios=null;
		this.localidad=null;
		this.publico=false;
		this.nombreDirector=null;
		this.numClases=0;
	}
	
	Instituto(String loc, int num,boolean pub,String dir, String[]j){
		this.jefesDeEstudios=j;
		this.localidad=loc;
		this.numClases=num;
		this.publico=pub;
		this.nombreDirector=dir;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getNumClases() {
		return numClases;
	}

	public void setNumClases(int numClases) {
		this.numClases = numClases;
	}

	public boolean getPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public String getNombreDirector() {
		return nombreDirector;
	}

	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public String getJefesDeEstudios() {
		String jefes = this.jefesDeEstudios[0];
		
		for(int c=1;c<this.jefesDeEstudios.length;c++) {
			jefes=jefes+" "+this.jefesDeEstudios[c];
		}
		
		return jefes;
	}

	public void setJefesDeEstudios(String[] jefesDeEstudios) {
		this.jefesDeEstudios = jefesDeEstudios;
	}
	
	public String toString() {
		return ("El instituto de localidad "+this.localidad+" con "+this.numClases+" clases con el director "+this.nombreDirector+" con los jefes de estudios "+this.jefesDeEstudios[0]+", "+this.jefesDeEstudios[1]+" y "+this.jefesDeEstudios[2]+"; es publico: "+this.publico);
	}
}
