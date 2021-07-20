import java.util.Scanner
class MultiplicationTable {
    var input = Scanner(System.`in`)
    var num = 0

    fun start()
    {
        print("Enter Multiplication Table Number: ")
        num = input.nextInt()
        println("Ranges")
        print("Start: ")
        val start = input.nextInt()
        print("End: ")
        val end = input.nextInt()

        val ranges = start..end

        mltplTbl(num , ranges)
    }

    fun mltplTbl (num: Int, range: IntRange)
    {
        for (x in range)
        {
            println("$num x $x = " + num*x)
        }
    }
}