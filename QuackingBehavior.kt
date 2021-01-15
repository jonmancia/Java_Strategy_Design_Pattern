package com.duck

interface QuackingBehavior {
    fun quack()
}

class Quack : QuackingBehavior {
    override fun quack() {
       println("Quack quack quack...")
    }
}

class MuteQuack : QuackingBehavior {
    override fun quack() {
        println("... ... ...")
    }
}

class Squeak : QuackingBehavior {
    override fun quack() {
        println("Squeak squeak squeak...")
    }
}