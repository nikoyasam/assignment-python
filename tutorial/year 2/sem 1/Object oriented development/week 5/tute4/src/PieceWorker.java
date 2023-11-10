public class PieceWorker extends Employee {
    private int pieces; // number of pieces produced
    private double wagePerPiece; // wage per piece

    public PieceWorker(Date birthdate, int pieces, double wagePerPiece) {
        super(birthdate);
        this.pieces = pieces;
        this.wagePerPiece = wagePerPiece;
    }

    @Override
    public double earnings() {
        return pieces * wagePerPiece;
    }
}