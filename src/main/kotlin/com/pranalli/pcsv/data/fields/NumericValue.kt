package com.pranalli.pcsv.data.fields

import java.math.BigDecimal

class NumericValue(private val number: BigDecimal) : CsvValue() {

    constructor(num: Number) : this(BigDecimal(num.toDouble()))

    override fun getValue(): BigDecimal {
        return number
    }

    override fun getSerializedValue(): String {
        return number.toPlainString()
    }
}