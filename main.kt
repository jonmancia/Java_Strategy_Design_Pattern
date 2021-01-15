package com.duck

fun main() {
    val myDuck: Duck = MallardDuck("Peter", 9)
    myDuck.setFlyingBehavior(FlyWithWings())
    myDuck.setQuackBehavior(Squeak())
    myDuck.fly()
    myDuck.quack()
}