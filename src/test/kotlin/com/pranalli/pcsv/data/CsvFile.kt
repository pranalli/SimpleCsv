package com.pranalli.pcsv.data

import com.pranalli.pcsv.data.fields.CsvField
import com.pranalli.pcsv.data.impl.IFile

class CsvFile : IFile<CsvField, CsvRow> {
    override fun getRows() : Collection<CsvRow> {
        return emptyList()
    }
}