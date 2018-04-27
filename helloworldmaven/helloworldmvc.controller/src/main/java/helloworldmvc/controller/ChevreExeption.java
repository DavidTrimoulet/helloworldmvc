package helloworldmvc.controller;

public class ChevreExeption extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "Beeeeh";
	}
}
