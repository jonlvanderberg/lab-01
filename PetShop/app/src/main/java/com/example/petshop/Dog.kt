package com.example.petshop

class Dog(name: String, age: Int): Pet(name, age), Pettable {
    override fun speak(): String {
        return "bark"
    }

    override fun pet() {
        println("the dog $name is being petted")
    }
}