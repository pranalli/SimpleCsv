package com.pranalli.pcsv.data.fields

class AlphaValue(private val string: CharSequence) : CsvValue() {
    override fun getValue() = string

    override fun getSerializedValue(): String {
        return if (string.contains(',')) string.quoted() else string as String
    }

    private fun CharSequence.quoted() : String {
        return "\"${this}\""
    }
}