package com.omao.lambdaexpressions

class HigherOrderFunctions {
    // this is a function that takes a function as a parameter or returns a function or both
    // In general, lambda expressions are passed as an argument to a higher-order function or returned from it.
    // We can also use anonymous functions for the same.

    val add = {a: Int, b: Int -> a + b}


    fun hof(addition: (Int, Int) -> Int) {
        var result = addition(4, 5)
        println(result)
    }

}