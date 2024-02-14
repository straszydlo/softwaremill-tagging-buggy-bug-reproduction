import com.softwaremill.tagging.*

trait Foo

@main def main = (new Foo {}).taggedWith[Int]

