fun main() {
    while (true) {
        println("Please enter a number or type stop to exi:")
        val input = readLine()

        if (input.equals("stop", ignoreCase = true)) {
            println("Program exited.")
            break
        }

        val number = input?.toIntOrNull()
        if (number != null) {
            println(if (number % 2 == 0) "Number is even" else "Number is odd")
        } else {
            println("Invalid input. Please enter a valid number.")
        }
    }
}
