package compiler;

public class CompileException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public final int lineNr;

	public CompileException(String reason) {
		super(reason);
		lineNr = -1;
	}

	public CompileException(String reason, int lineNr) {
		super(reason);
		this.lineNr = lineNr;
	}

	public CompileException(Throwable reason) {
		super(reason);
		this.lineNr = -1;
	}

	public CompileException(Throwable reason, int lineNr) {
		super(reason);
		this.lineNr = lineNr;
	}

	@Override
	public String getMessage() {
		if (lineNr == -1)
			return super.getMessage();
		return "on line " + lineNr + ": " + super.getMessage();
	}

}
