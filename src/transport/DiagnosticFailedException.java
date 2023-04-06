package transport;

public class DiagnosticFailedException extends Exception {
    public DiagnosticFailedException() {
        super("Необходимо указать тип прав!");
    }
}
