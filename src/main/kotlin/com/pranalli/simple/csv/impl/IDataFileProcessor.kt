package com.pranalli.simple.csv.impl

/**
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
interface IDataFileProcessor {
    fun <R : IField<Any>, T : IRow<R>> read(path: String) : IFile <R, T> 
}
