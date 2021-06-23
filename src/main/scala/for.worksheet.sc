val amounts = Array(10, 24, 35, 23, 12)
val currencies = Array("USD", "EUR")

var sum = 0
for (amount <- amounts){
    sum = sum + amount
    println(amount)
}

println(sum)

val symbol1 = for (amount <- amounts) yield {
    amount
}

val symbol2 = for (amount <- amounts) yield amount

val symbol3 = for {
    amount <- amounts
    currency <- currencies
} yield {
    currency + " " + amount
}

val symbol4 = for {
    amount <- amounts
    currency <- currencies
    if amount > 20 && amount < 30
} yield {
    currency + " " + amount
}

amounts.foreach(amount => println(amount * 1000))
