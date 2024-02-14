package tag.me

trait Foo

@main def main = (new Foo {}).taggedWith[Int]

trait Tag[+U] extends Any { type Tag <: U }
type @@[+T, +U] = T with Tag[U]
type Tagged[+T, +U] = T with Tag[U]

implicit class Tagger[T](val t: T) extends AnyVal {
  @inline def taggedWith[U]: T @@ U = t.asInstanceOf[T @@ U]
}

