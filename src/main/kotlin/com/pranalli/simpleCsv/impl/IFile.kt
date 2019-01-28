package com.pranalli.simpleCsv.impl

/**
 * The [IFile] interface is a wrapper for any given collection of members of the
 * [IRow] interface.  It is meant to be a representation of a full data file.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
interface IFile <R : IField<Any>, T : IRow<R>> {
    fun getRows() : Collection<T>
}
