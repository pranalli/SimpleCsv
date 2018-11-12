package com.pranalli.pcsv.data

import com.pranalli.pcsv.data.fields.CsvValue
import com.pranalli.pcsv.data.impl.IRow
import java.util.*

class CsvRow : IRow<CsvValue> {
    private val fields = ArrayList<CsvValue>()

    override fun getValues(): Collection<CsvValue> {
        return Collections.unmodifiableCollection(fields)
    }
}