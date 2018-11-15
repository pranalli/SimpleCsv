package com.pranalli.pcsv.data

import com.pranalli.pcsv.data.fields.CsvValue
import com.pranalli.pcsv.data.impl.IFile
import java.util.*

class CsvFile: IFile<CsvValue, CsvRow> {
    private val rows = ArrayList<CsvRow>()

    fun add(row: CsvRow) {
        rows.add(row)
    }

    override fun getRows() : Collection<CsvRow> {
        return Collections.unmodifiableCollection(rows)
    }
}