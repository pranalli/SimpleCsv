package com.pranalli.pcsv.data.fields

import com.pranalli.pcsv.data.impl.IField

abstract class CsvField : IField<Any> {
    abstract fun getSerializedValue() : String
}