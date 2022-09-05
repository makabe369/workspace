package ATM;

public class Uketsuke {
	public Uketsuke() {
	}
	public boolean furikomi(FurikomiYoushi f,) {
		KouzaLogic kl =new KouzaLogic();
		if(kl.excute(f.getMotoKouza())) {
			if(kl.excute(f.getSakikouza()));
			if(kl.excute(f.getKingaku())) {
				return true;
			}
		}
	}
	return true;
}
