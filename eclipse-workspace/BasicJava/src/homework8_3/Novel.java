package homework8_3;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		return 300 * lateDays;
	}
}
