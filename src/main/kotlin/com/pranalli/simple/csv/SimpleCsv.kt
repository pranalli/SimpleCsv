package com.pranalli.simple.csv

import com.pranalli.simple.csv.data.CsvFile
import com.pranalli.simple.csv.data.CsvRow
import java.io.File

/**
 * Simple CSV is a lightweight object providing static methods for
 * reading and creating CSV files.  It is meant to encapsulate the
 * underlying mechanics in order to provide a clean interface for
 * users.  It is lightweight and provides no "bloat" of unnecessary
 * features for the majority of users.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
object SimpleCsv {

    /**
     * Reads CSV data from a [File] object.
     *
     * @param file The file that contains CSV data
     * @return A [CsvFile] instance representing the contents of the file
     */
    @JvmStatic
    fun read(file: File): CsvFile = CsvReader().use { it.read(file) }

    /**
     * Reads CSV data from a CSV string.
     *
     * @param csvString The [String] of CSV data
     * @return A [CsvFile] instance representing the contents of the [String]
     */
    @JvmStatic
    fun read(csvString: String): CsvFile = CsvReader().use { it.read(csvString) }

    /**
     * Creates a [CsvBuilder] instance to be used for creating a [CsvFile]
     *
     * @return A [CsvBuilder] instance
     */
    @JvmStatic
    fun build(): CsvBuilder = CsvBuilder()

    /**
     * The [CsvBuilder] class may be used in a builder-pattern to construct
     * a custom [CsvFile].
     */
    class CsvBuilder internal constructor() {
        private val rows = ArrayList<CsvRow>()

        /**
         * Appends a given value to the last row.
         *
         * @param value [Any] value to be appended to the last row
         */
        fun append(value: Any) = this.apply { rows.last().add(value) }

        /**
         * Creates a new row
         */
        fun newRow() = this.apply { rows.add(CsvRow()) }

        /**
         * Crystallizes the object and returns as a [CsvFile]
         *
         * @return A completed [CsvFile]
         */
        fun create() = CsvFile(rows)
    }
}