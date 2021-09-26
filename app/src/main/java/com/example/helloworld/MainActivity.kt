//name of the package that contains this file, PACKAGE = FOLDER
package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //"onCreate" method, which is the starting point of our application.
    // When our application starts, the code between the two curly brackets executes.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Welcome to Android Studio!")
        var a=1
        var b=2
        var s:Int=a+b
        println("the sume of $a and $b is $s")
        if (s==3){
            print()
        }
    }
    fun print(){
        println("Hello form print function!")
    }
}