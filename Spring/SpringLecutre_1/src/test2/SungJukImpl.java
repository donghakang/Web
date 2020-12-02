package test2;

public class SungJukImpl implements SungJuk{
	private SungJukDTO sungjukdto;

	public SungJukImpl(SungJukDTO sungjukdto) {
		super();
		this.sungjukdto = sungjukdto;
	}

	@Override
	public int getTot() {
		return sungjukdto.getEng() + sungjukdto.getKor() + sungjukdto.getMat();
	}

	@Override
	public double getAvg() {
		return this.getTot() / 3.0;
	}

	@Override
	public String toString() {
		return sungjukdto.getName() + "\t" + 
				sungjukdto.getKor() + "\t" +
				sungjukdto.getEng() + "\t" +
				sungjukdto.getMat() + "\t" +
				this.getTot() + "\t" +
				this.getAvg() + "\n";
				
	}
	
	
	
}
