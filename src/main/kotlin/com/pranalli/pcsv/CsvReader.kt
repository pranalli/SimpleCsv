package com.pranalli.pcsv

import com.pranalli.pcsv.data.CsvFile
import com.pranalli.pcsv.data.CsvRow
import java.io.File
import java.io.FileInputStream
import java.io.FileReader
import java.util.*
import java.util.regex.Pattern

object CsvReader {
    private val CHARSET = Charsets.UTF_8
//    private const val DELIMITER = ","
    private const val DELIMITER = "/(?:\"[^\"]*\\\"|[^,])+/g"
//    private val DELIMITER = "/(?:\"(?:\\.|[^\"])*\"|\\.|[^,])+/g"
//    private val DELIMITER = Pattern.compile(".*,.*")

    fun read(path: String) : CsvFile {
        val file = CsvFile()
        val scanner = Scanner(File(path), CHARSET)
        scanner.use { scan ->
            while (scan.hasNextLine()) {
                val row = CsvRow()
                val line = scan.nextLine()
                line.split(DELIMITER).forEach {
                    row.add(it)
//                }
//                DELIMITER.matcher(line).results().forEach {
//                    for (i in 0 until it.groupCount()) {
//                        row.add(it.group(i))
//                    }
                }

                file.add(row)
            }

        }

        return file
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val path = "/Users/pasquale/git/pranalli/out/production/pcsv/sample.csv"
        val file = CsvReader.read(path)
        println(CsvSerializer.toCsv(file))
    }
}