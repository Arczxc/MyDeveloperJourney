import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    print("Enter your Name: ")
    val name = input.nextLine()
    print("Enter your Birthyear: ")
    val year = input.nextInt()

    val obj = ChineseZodiac()



    obj.checkZodiac(year , name)


}