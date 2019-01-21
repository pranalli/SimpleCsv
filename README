SimpleCsv is nothing more than the name implies.

It is a simple CSV utility written in Kotlin.

SimpleCsv.read(File)
SimpleCsv.read(String)
SimpleCsv.build()

Build example:

```kotlin
val builder = SimpleCsv.build()
builder.newRow().append("John").append("Doe")
builder.newRow().append("8,000").append("8000")
builder.newRow().append("123 Main St").append("Anytown, USA")

val csv = builder.create()
println(csv)
```

Output:

```
John,Doe
"8,000",8000
123 Main St,"Anytown, USA"
```

Data types and quoting are handled transparently to the caller.

That's it.  Have fun.