package com.duck

abstract class Duck(private var _name: String, private var _age: Int) {

    protected lateinit var _flyingBehavior: FlyingBehavior
    protected lateinit var _quackBehavior: QuackingBehavior

    // Public methods
    fun swin(): String {
        return _name
    }

    fun display(): String {
        return "This is a duck called $_name"
    }

    fun setFlyingBehavior(flyingBehavior: FlyingBehavior) {
        _flyingBehavior = flyingBehavior
    }

    fun setQuackBehavior(quackingBehavior: QuackingBehavior) {
        _quackBehavior = quackingBehavior
    }

    fun fly() {
        _flyingBehavior.fly()
    }

    fun quack() {
        _quackBehavior.quack()
    }
}