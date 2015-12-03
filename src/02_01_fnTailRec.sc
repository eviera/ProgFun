def sum(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 0 else f(a) + sum(f)(a + 1, b)
}

sum(x => x * x)(0, 5)

def sum2(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

sum2(x => x * x)(0, 5)