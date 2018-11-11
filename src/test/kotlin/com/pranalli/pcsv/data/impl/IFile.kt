package com.pranalli.pcsv.data.impl

interface IFile <R : IField<Any>, T : IRow<R>> {
    fun getRows() : Collection<T>
}
