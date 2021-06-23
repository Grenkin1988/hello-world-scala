var amount = 550

amount match {
    case 50 => println("$50")
    case 100 => println("$100")
    case _ => println("Really bad")
}

amount match {
    case a if a >= 50 => println("bill is >= 50, it's " + a)
    case a => println("The amount is " + a)
}


val result = amount match {
    case a if a >= 50 => "bill is >= 50, it's " + a
    case a => "The amount is " + a
}

abstract class Currency

case class USD() extends Currency
case class EUR() extends Currency
case class DKK() extends Currency

val currency : Currency = DKK()
currency match {
    case a: EUR => println("EUR " + amount)
    case a: USD => println("USD " + amount)
    case a: DKK => println("DKK " + amount)
}

val anArray = Array(100, 200, 300)

anArray match {
    case Array(f, s, t) => println("f: " + f + ", s: " + s + ", t: " + t)
}

val aTuple = ("EUR", 100)

aTuple match {
    case (currency, amount) if currency == "USD"=> println("USD " + amount)
    case (currency, amount) if currency == "EUR"=> println("EUR " + amount)
}
