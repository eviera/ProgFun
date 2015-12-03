def factorial(x: Int): Int = {
  if (x == 0) 1 else x * factorial (x - 1)
}

factorial(5)
factorial(1)
factorial(0)

def factorial_tailrec(x: Int, acum: BigDecimal): BigDecimal = {
  if (x == 0) acum else factorial_tailrec(x - 1, x * acum)
}

factorial_tailrec(5, 1)
factorial_tailrec(1, 1)
factorial_tailrec(0, 1)
//factorial_tailrec(20, 1)



