package chapter08;

public class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE = 100;

	public int getErrorCode() {
		return ERR_CODE;
	}

	public String getMessage() {
		return null;
	}

}
