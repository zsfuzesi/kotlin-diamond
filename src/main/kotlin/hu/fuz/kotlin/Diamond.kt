package hu.fuz.kotlin

class Diamond(private val number:Int) {

    override fun toString() : String {
        val sb = StringBuilder()
        (1..number).forEach { sb.append(generateNumbersRow(it)) }
        (number-1 downTo 1).forEach { sb.append(generateNumbersRow(it)) }
        return sb.toString().removeLastNewLine()
    }

    private fun String.removeLastNewLine() = this.replace(Regex("${System.lineSeparator()}$"),"")

    private fun generateNumbersRow(rowIndex: Int) =
            " ".repeat(number-rowIndex) + generateNumbersString(rowIndex) + System.lineSeparator()

    fun generateNumbersString(maxNumber : Int): String{
        if(maxNumber == 1 )
            return "1"
        return generateRowGreaterThanTwo(maxNumber)
    }

    private fun generateRowGreaterThanTwo(maxNumber: Int): String {
        val sb = StringBuilder()
        (1..maxNumber).forEach{sb.append(it)}
        (maxNumber-1 downTo 1).forEach{sb.append(it)}
        return sb.toString()
    }
}