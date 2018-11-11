package com.pranalli.pcsv.data

import com.pranalli.pcsv.data.fields.CsvField
import com.pranalli.pcsv.data.impl.IRow
import java.util.*

class CsvRow : IRow<CsvField> {
    private val fields = ArrayList<CsvField>()

    override fun getValues(): Collection<CsvField> {
        return Collections.unmodifiableCollection(fields)
    }
}