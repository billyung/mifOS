package RealMachine;

/**
 *
 * @author neworld
 */
public class Service extends Process {
	public Service (Machine machine, String name, Busenos busena) {
		super(machine, name, busena, 0x0);
	}

	public void interupt(Interupt i) {
		
	}
	
	@Override
	public boolean run() {
		if (Busenos.READY == busena) {
			
			doService();
			
			return true;
		} else {
			return false;
		}
	}

	private void doService() {
		
	}
}
