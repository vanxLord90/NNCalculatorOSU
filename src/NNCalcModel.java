import components.naturalnumber.NaturalNumber;


public interface NNCalcModel {

    /**
     * Reports top operand.
     *
     * @return this.top
     * @aliases reference returned by {@code top}
     * @ensures top = this.top
     */
    NaturalNumber top();

    /**
     * Reports bottom operand.
     *
     * @return this.bottom
     * @aliases reference returned by {@code bottom}
     * @ensures bottom = this.bottom
     */
    NaturalNumber bottom();

}
