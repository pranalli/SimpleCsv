package com.pranalli.simpleCsv.data.data

import com.pranalli.simpleCsv.CsvSerializer
import com.pranalli.simpleCsv.data.impl.IFile
import java.util.*

/**
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
class CsvFile: IFile<CsvValue, CsvRow> {
    private val rows = ArrayList<CsvRow>()

    fun add(row: CsvRow) {
        rows.add(row)
    }

    override fun getRows() : Collection<CsvRow> {
        return Collections.unmodifiableCollection(rows)
    }

    override fun toString(): String {
        return CsvSerializer.toCsv(this)
    }
}