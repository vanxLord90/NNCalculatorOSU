import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;


public final class NNCalcModel1 implements NNCalcModel {

    /**
     * Model variables.
     */
    private final NaturalNumber top, bottom;

    /**
     * Default constructor.
     */
    public NNCalcModel1() {
        this.top = new NaturalNumber2();
        this.bottom = new NaturalNumber2();
    }

    @Override
    public NaturalNumber top() {
        // return top number
        return this.top;
    }

    @Override
    public NaturalNumber bottom() {
        // return bottom number
        return this.bottom;
    }

}
