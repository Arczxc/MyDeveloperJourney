class ChineseZodiac {

    fun checkZodiac (y: Int , n : String)
    {
        val print = n + " you are "
        when (y%12)
        {
            1 -> print(print + "Year of the Rooster")
            2 -> print(print +"Year of the Dog")
            3 -> print(print +"Year of the Pig")
            4 -> print(print +"Year of the Rat")
            5 -> print(print +"Year of the Ox")
            6 -> print(print +"Year of the Tiger")
            7 -> print(print +"Year of the Rabbit")
            8 -> print(print +"Year of the Dragon")
            9 -> print(print +"Year of the Snake")
            10 -> print(print +"Year of the Horse")
            11 -> print(print +"Year of the Goat")
            12 -> print(print +"Year of the Monkey")
            else -> print("Invalid Input")
        }
    }
}