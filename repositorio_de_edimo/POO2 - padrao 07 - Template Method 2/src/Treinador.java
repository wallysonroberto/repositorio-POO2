
public abstract class Treinador {
	private Time time;

	public void instruirTime() {
		if (getTime().isPerdendo()) {
			atitudePerdendo();
		} else if (getTime().isEmpatando()) {
			atitudeEmpatando();
		}else if(getTime().isGoleada()){
                    atitudeGoleada();
                }
                else {
			atitudeVencendo();
		}
	}

	protected abstract void atitudePerdendo();

	protected abstract void atitudeEmpatando();

	protected abstract void atitudeVencendo();
        
        protected abstract void atitudeGoleada();
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

   
}
