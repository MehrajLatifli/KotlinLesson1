fun main ()
{
    println("\n");

    // Task 1

    var name = "Name_1"
    var surname = "Surname_1"
    var age=40
    var isStudent =true

    println("Data_1: "+name+" "+surname+" "+age+" "+isStudent)


    var name2:String = "Name_2"
    var surname2:String = "Surname_2"
    var age2:Int=20
    var isStudent2:Boolean =true

    println("Data_2: "+name2+" "+surname2+" "+age2+" "+isStudent2)

    println("\n");

    // Task 2

    var A = 24
    var B = 24

    var area_of_the_square = A*B
    var perimeter_of_the_square = 2*(A+B)

    println("area of the square: "+" "+ area_of_the_square)
    println("perimeter of the square: "+" "+ perimeter_of_the_square);

    println("\n");

    // Task 3

    var list = arrayOf<String>("Baku","Astana","Ankara","Bishkek","Tashkent","Ashgabat")

    list.forEachIndexed { index, element ->
        println("$index: $element")
    }

    val customIndex = 2
    val newCity = "Izmir"

    if (customIndex in list.indices) {

        list[customIndex] = newCity

        println("\nUpdated array: " )

        list.forEachIndexed { index, element ->
            println("$index: $element")
        }

    } else {
        println("Index out of bounds")
    }

    println("\n");

    // Task 4

    var num1:Double =255.255
    var num2:Int =1000

    var numList = arrayOf<Any>(num1,num2)
    var doubleNumList = numList.map { it.toString().toDouble() }

    var sum = num1 + num2
    var subtraction = num1 - num2
    var division = num1 / num2
    var multiplication = num1 * num2
    var modulus = num1.rem(num2)

    var average = doubleNumList.average()


    println("Sum: $num1 + $num2 = $sum")
    println("Subtraction: $num1 - $num2 = $subtraction" )
    println("Division: $num1 / $num2 = $division" )
    println("Multiplication: $num1 * $num2 = $multiplication" )
    println("Modulus: $num1 % $num2 = $modulus" )
    println("Average: $average" )
}
