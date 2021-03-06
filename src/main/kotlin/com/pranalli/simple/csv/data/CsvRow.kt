package com.pranalli.simple.csv.data

import com.pranalli.simple.csv.impl.IRow
import java.util.*

/**
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
class CsvRow : IRow<CsvValue> {
    private val fields = ArrayList<CsvValue>()

    fun add(v : Any) {
        fields.add(CsvValue.of(v))
    }

    override fun getValues(): Collection<CsvValue> {
        return Collections.unmodifiableCollection(fields)
    }
}