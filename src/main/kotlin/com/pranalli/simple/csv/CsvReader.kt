package com.pranalli.simple.csv

import com.pranalli.simple.csv.data.CsvFile
import com.pranalli.simple.csv.data.CsvRow
import com.pranalli.simple.csv.data.CsvValue
import java.io.*
import java.lang.StringBuilder

/**
 * CsvReader is an internal utility class that is encapsulated
 * by [SimpleCsv].
 *
 * @see SimpleCsv
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
internal class CsvReader : Closeable {

    internal fun read(file: File): CsvFile {
        return read(FileReader(file))
    }

    internal fun read(csvString: String) : CsvFile {
        return read(StringReader(csvString))
    }

    private fun read(r: Reader) : CsvFile {
        val csv = CsvFile()
        r.useLines { lines ->
            lines.forEach {
                line -> csv.add(processLine(line))
            }
        }

        return csv
    }

    private fun processLine(line: String) : CsvRow {
        var insideQuote = false
        var sb = StringBuilder()
        val row = CsvRow()
        line.forEach { char ->
            val isQuote = char == '\"'
            val isDelimiter = char == DELIMITER
            when {
                isQuote -> insideQuote = !insideQuote
                !isDelimiter || insideQuote -> sb.append(char)
                else -> {
                    row.add(CsvValue.of(sb.toString().trim()))
                    sb = StringBuilder()
                }
            }
        }

        return row
    }

    override fun close() { /* Not used currently */ }

    companion object {
        private const val DELIMITER = ','
    }
}

fun main(args: Array<String>) {
    val file = File("./src/res/sample.csv")
    println(SimpleCsv.read(file))
}

