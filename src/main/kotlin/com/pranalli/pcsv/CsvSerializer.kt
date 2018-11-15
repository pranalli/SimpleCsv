package com.pranalli.pcsv

import com.pranalli.pcsv.data.CsvFile

object CsvSerializer {

    fun toCsv(file: CsvFile, params: CsvSerializerParams? = null) : String {
        val sb = StringBuilder()
        file.getRows().forEachIndexed { rowIndex, row ->

            row.getValues().forEachIndexed { valueIndex, value ->
                sb.append(value.getSerializedValue())
                if (valueIndex < row.getValues().size)
                    sb.append(',')
            }

            if (rowIndex < file.getRows().size)
                sb.nl()
        }

        return sb.toString()
    }

    private fun StringBuilder.nl() {
        this.append("\n\r")
    }

    class CsvSerializerParams {

    }
}

