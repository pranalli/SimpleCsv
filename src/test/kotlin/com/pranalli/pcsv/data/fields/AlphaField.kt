package com.pranalli.pcsv.data.fields

class AlphaField(private val string: String) : CsvField() {
    override fun getValue() = string

    override fun getSerializedValue(): String {
        return if (string.contains(',')) string.quoted() else string
    }

    private fun String.quoted() : String {
        return "\"${this}\""
    }
}