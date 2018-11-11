package com.pranalli.pcsv.data

import com.pranalli.pcsv.data.impl.IFile

class CsvFile : IFile<CsvRow> {
    override fun getRows() : Collection<CsvRow> {
        return emptyList()
    }
}