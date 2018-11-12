package com.pranalli.pcsv.data

import com.pranalli.pcsv.data.fields.CsvValue
import com.pranalli.pcsv.data.impl.IFile

class CsvFile : IFile<CsvValue, CsvRow> {
    override fun getRows() : Collection<CsvRow> {
        return emptyList()
    }
}