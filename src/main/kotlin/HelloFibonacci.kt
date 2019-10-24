fun main(args: Array<String>) {
    printFibonacci(10)
}

fun printFibonacci(to: Int) {
    printFibonacciImpl(index = 1, a = 1,b = 1,to = to)
}

fun printFibonacciImpl(index: Int, a: Int, b: Int, to: Int): Unit {
    if(index <= to) {
        println("${a} + ${b} = ${a + b} \n")
        printFibonacciImpl(index + 1, b, a + b, to)
    }
}
