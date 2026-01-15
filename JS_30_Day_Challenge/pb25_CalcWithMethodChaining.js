class Calculator {
    /**
     * @param {number} value
     */
    constructor(value) {
        this.result = value;
    }

    /**
     * @param {number} value
     * @return {Calculator}
     */
    add(value) {
        this.result += value;
        return this;
    }

    /**
     * @param {number} value
     * @return {Calculator}
     */
    subtract(value) {
        this.result -= value;
        return this;
    }

    /**
     * @param {number} value
     * @return {Calculator}
     */
    multiply(value) {
        this.result *= value;
        return this;
    }

    /**
     * @param {number} value
     * @return {Calculator}
     */
    divide(value) {
        if (value === 0) throw new Error('Division by zero is not allowed');
        this.result /= value;
        return this;
    }

    /**
     * @param {number} value
     * @return {Calculator}
     */
    power(value) {
        this.result = Math.pow(this.result, value);
        return this;
    }

    /**
     * @return {number}
     */
    getResult() {
        return this.result;
    }
}

// here we are returning calculator object itself because we're going to use it like method chaining,
// calculator.add(5).multiply(2).subtract(3).getResult()

/**
 * const calculator = new Calculator(10);
 * const result = calculator.add(5).multiply(2).subtract(3).getResult(); // 27
 */

// so if we direcly return the result value from each method, we won't be able to chain the methods one after another
// cacluator.add(5) would return 15, and we can't call .multiply(2) on a number.
