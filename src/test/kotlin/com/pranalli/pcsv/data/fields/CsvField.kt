package com.pranalli.pcsv.data.fields

import com.pranalli.pcsv.data.impl.IField

abstract class CsvField<T : Any> : IField<T> {
    abstract fun getSerializedValue() : String
}