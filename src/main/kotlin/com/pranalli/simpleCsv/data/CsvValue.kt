package com.pranalli.simpleCsv.data

import com.pranalli.simpleCsv.impl.IField

/**
 * [CsvValue] is a simple wrapper for any given data object
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
abstract class CsvValue : IField<Any> {
    abstract fun getSerializedValue() : String

    override fun toString(): String {
        return getSerializedValue()
    }

    companion object {
        fun of(value: Any) : CsvValue {
            return when (value) {
                is CharSequence -> {
                    AlphaValue(value)
                }
                is Number -> {
                    NumericValue(value)
                }
                is CsvValue -> {
                    value
                }

                else -> throw NotImplementedError("Class ${value::class.java.simpleName} not yet implemented.")
            }
        }
    }
}