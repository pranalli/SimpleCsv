package com.pranalli.simpleCsv.data

import com.pranalli.simpleCsv.CsvSerializer
import com.pranalli.simpleCsv.impl.IFile
import java.util.*

/**
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
class CsvFile internal constructor(): IFile<CsvValue, CsvRow> {
    private val _rows = ArrayList<CsvRow>()

    internal constructor(rows: Collection<CsvRow>) : this() {
        this.addAll(rows)
    }

    fun add(row: CsvRow) {
        _rows.add(row)
    }

    fun addAll(rows: Collection<CsvRow>) {
        this._rows.addAll(rows)
    }

    override fun getRows() : Collection<CsvRow> {
        return Collections.unmodifiableCollection(_rows)
    }

    override fun toString(): String {
        return CsvSerializer.toCsv(this)
    }
}