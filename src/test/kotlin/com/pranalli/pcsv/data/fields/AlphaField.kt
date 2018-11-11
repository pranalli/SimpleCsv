package com.pranalli.pcsv.data.fields

class AlphaField(private val string: String) : CsvField<String>() {
    override fun getValue() = string

    override fun getSerializedValue(): String {
        return if (string.contains(',')) string.quoted() else string
    }

    private fun String.quoted() : String {
        return "\"${this}\""
    }
}