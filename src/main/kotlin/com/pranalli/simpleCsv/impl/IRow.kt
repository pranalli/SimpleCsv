package com.pranalli.simpleCsv.impl

/**
 * The [IRow] interface is a simple wrapper for any given collection of members of the
 * [IField] interface.  It is meant to represent a "row" of data.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
interface IRow <T : IField<Any>> {
    fun getValues() : Collection<T>
}

