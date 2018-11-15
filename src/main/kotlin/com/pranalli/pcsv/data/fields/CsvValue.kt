package com.pranalli.pcsv.data.fields

import com.pranalli.pcsv.data.impl.IField
import java.math.BigDecimal

abstract class CsvValue : IField<Any> {
    abstract fun getSerializedValue() : String

    companion object {
        fun of(value: Any) : CsvValue {
            return when (value) {
                is CharSequence -> {
                    AlphaValue(value)
                }
                is BigDecimal -> {
                    NumericValue(value)
                }
                is Number -> {
                    NumericValue(value)
                }
                else -> throw NotImplementedError("Class ${value::class.java.simpleName} not yet implemented.")
            }
        }
    }
}