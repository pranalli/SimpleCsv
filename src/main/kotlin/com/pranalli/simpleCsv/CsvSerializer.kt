package com.pranalli.simpleCsv

import com.pranalli.simpleCsv.data.data.CsvFile

/**
 * [CsvSerializer] is an internal utility class for serializing
 * [CsvFile] objects.  It is not meant to be used directly.
 *
 * @see CsvFile.toString
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
object CsvSerializer {

    internal fun toCsv(file: CsvFile): String {
        val sb = StringBuilder()
        file.getRows().forEachIndexed { rowIndex, row ->

            row.getValues().forEachIndexed { valueIndex, value ->
                sb.append(value.getSerializedValue())
                if (valueIndex + 1 < row.getValues().size)
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
}

