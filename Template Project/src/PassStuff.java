
public class PassStuff {

	private String fizz;
	private String Buzz;

	public PassStuff(String fizz, String buzz) {

		this.fizz = fizz;
		this.Buzz = buzz;

	}

	public String concatenate() {
		String smashEm = this.fizz + " " + this.Buzz;
		return smashEm;
	}

}
