package com.duck

interface FlyingBehavior {
    fun fly()
}

class FlyWithWings : FlyingBehavior {
    override fun fly() {
        println("Flying with wings")
    }
}

class FlyNoWay : FlyingBehavior {
    override fun fly() {
        println("Can't fly")
    }
}