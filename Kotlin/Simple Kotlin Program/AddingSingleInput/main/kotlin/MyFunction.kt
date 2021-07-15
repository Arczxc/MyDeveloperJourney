import java.util.Scanner
class MyFunction {

    val input = Scanner(System.`in`)

    fun start()
    {
        print("Enter Integer: ")
        val num = input.nextInt()
        val singleInput = num.toString()
        compute(singleInput)
    }
    fun compute(num: String)
    {
        var sum = 0
        
        for (x in num.indices)
        {
            sum += num[x].toInt() - 48
        }
        println(sum)
    }
}