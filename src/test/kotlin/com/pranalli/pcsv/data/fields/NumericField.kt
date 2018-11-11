package com.pranalli.pcsv.data.fields

import java.math.BigDecimal

class NumericField(private val number: BigDecimal) : CsvField<BigDecimal>() {

    override fun getSerializedValue(): String {
        return number.toPlainString()
    }

    override fun getValue(): BigDecimal {
        return number
    }
}