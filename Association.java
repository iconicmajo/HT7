/**
 * 
 */

/**
 * @author Majo!
 *
 */
public class Association {
	
	private String english;
	private String spanish;
	
	/**
	 * @param english
	 * @param spanish
	 */
	public Association(String english, String spanish) {
		this.english = english;
		this.spanish = spanish;
	}

	/**
	 * @return the english
	 */
	public String getEnglish() {
		return english;
	}

	/**
	 * @param english the english to set
	 */
	public void setEnglish(String english) {
		this.english = english;
	}

	/**
	 * @return the spanish
	 */
	public String getSpanish() {
		return spanish;
	}

	/**
	 * @param spanish the spanish to set
	 */
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Association [english=" + english + ", spanish=" + spanish + "]";
	}
	
	

}
