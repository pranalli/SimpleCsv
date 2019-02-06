package com.pranalli.simple.csv.data

/**
 * An object containing alpha values.  It appropriately handles
 * whether a value should be quoted or not when serialized.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
class AlphaValue(private val string: CharSequence) : CsvValue() {
    override fun getValue() = string

    override fun getSerializedValue(): String {
        return if (string.contains(',')) string.quoted() else string as String
    }

    private fun CharSequence.quoted() : String {
        return "\"${this}\""
    }
}