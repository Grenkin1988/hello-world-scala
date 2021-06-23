def square(x: Int) ={
    x * x
}

def multiply(x: Int, y: Int) ={
    x * y
}

val sq_2 = square(2)

val funAppl = multiply(2, _: Int)
val mul_2 = funAppl(3)

def multiply(nums: Int*) ={
    var product = 1
    for(num <- nums) product = product * num
    product
}

val mul_3 = multiply(1,2,3)
val mul_4 = multiply(1,2,3,4,5)

def sumOdd(n: Int) = {
    def getOdd(x: Int) = {
        var result = Array[Int]()
        var current = 1
        while (current <= x){
            if (current % 2 == 1) result = result :+ current
            current = current + 1
        }
        result
    }

    val odds = getOdd(n)
    println(odds.mkString(","))
    odds.sum
}

val sum_4 = sumOdd(10)

def greet(first: String, last: String) = {
    println("Hello! " + first + ", " + last)
}

greet("Tony", "Stark")

greet(last = "Stark", first = "Tony")


//def square(n: Int) = n * n // Int => Int
def cube(n: Int) = n * n * n // Int => Int
def sum(a: Int, b: Int) = a + b // (Int, Int) => Int
def length(a: String) = a.length // String => Int

def transform(f: Int => Int, numbers: Int*) = numbers.map(f)

transform(square, 1, 2, 3, 4)
transform(cube, 1, 2, 3, 4, 5)

transform((n: Int) => n * n, 1, 2, 3, 4)
transform(n => n * n * n, 1, 2, 3, 4)

val numbers = Array(1, 2, 3, 4,5,6, 7)

numbers.map(n => n * 2)
numbers.filter(n => (n % 2) == 0)
