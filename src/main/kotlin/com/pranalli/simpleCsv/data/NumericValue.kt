package com.pranalli.simpleCsv.data

import java.math.BigDecimal

/**
 * An object that serves as a wrapper for numeric CSV values.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */

class NumericValue(number: Number) : CsvValue() {

    private val _num: BigDecimal =
        when (number) {
            is BigDecimal -> number
            else -> BigDecimal(number.toDouble())
    }

    override fun getValue(): BigDecimal {
        return _num
    }

    override fun getSerializedValue(): String {
        return _num.toPlainString()
    }
}