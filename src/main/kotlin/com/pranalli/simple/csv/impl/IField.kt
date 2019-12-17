package com.pranalli.simple.csv.impl

/**
 * The [IField] interface is a simple wrapper for any given object, typically
 * used to construct members of the [IRow] interface.
 *
 * @author Pasquale A. Ranalli
 * @email pranalli@gmail.com
 */
interface IField<T : Any> {
    fun getValue(): T
}
