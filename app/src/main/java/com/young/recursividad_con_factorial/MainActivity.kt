package com.young.recursividad_con_factorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numFactorial = 4

        println(factorial(numFactorial))

    }

    fun factorial(numFactorial: Int): Int{

        return if (numFactorial == 0){
            1
        }else{

            numFactorial.times(factorial(numFactorial - 1))
        }
    }
}
