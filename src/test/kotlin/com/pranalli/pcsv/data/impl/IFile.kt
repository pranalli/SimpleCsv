package com.pranalli.pcsv.data.impl

interface IFile <T : IRow<IField<Any>>> {
    fun getRows() : Collection<T>
}
