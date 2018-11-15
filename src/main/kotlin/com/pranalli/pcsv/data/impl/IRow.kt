package com.pranalli.pcsv.data.impl

interface IRow <T : IField<Any>> {
    fun getValues() : Collection<T>
}

