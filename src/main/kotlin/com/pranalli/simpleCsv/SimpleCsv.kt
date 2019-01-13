package com.pranalli.simpleCsv

import com.pranalli.simpleCsv.data.data.CsvFile
import java.io.File

/**
 * Simple CSV is a utility object for reading CSV files from
 * common sources.  It's a lightweight utility with none of the
 * bloat and "features" that few people actually need.  It reads
 * CSV files and returns them as [CsvFile] objects.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
object SimpleCsv {
    @JvmStatic
    fun read(file: File) : CsvFile {
        return CsvReader().use { it.read(file) }
    }

    @JvmStatic
    fun read(csvString: String) : CsvFile {
        return CsvReader().use { it.read(csvString) }
    }
}