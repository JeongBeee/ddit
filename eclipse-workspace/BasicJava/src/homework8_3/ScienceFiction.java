package homework8_3;

public class ScienceFiction extends Book {
	
	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		return 600 * lateDays;
	}
}
