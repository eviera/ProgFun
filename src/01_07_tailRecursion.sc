def factorial(x: Int): Int = {
  if (x == 0) 1 else x * factorial (x - 1)
}

factorial(5)

def factorial_tailrec(x: Int, acum: Int): Int = {
  //if (x == 0) acum else factorial_tailrec(x - 1, x)
}

factorial_tailrec(5, 1)

