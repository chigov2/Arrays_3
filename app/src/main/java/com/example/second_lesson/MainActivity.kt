package com.example.second_lesson

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var tvText1: TextView? = null
    private var tvText2: TextView? = null
    private var cLayout1: ConstraintLayout? = null
    private var number1: Int = 5
    private var number2: Int = 5
    private var start: Boolean = false
    private var counter: Int = 0
    private var text: String = "text <div> bla <div2> bla  <div3> text text </div5> bla2 </div6>bla2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText1 = findViewById(R.id.tvText)
        tvText2 = findViewById(R.id.tv2Text)
        //var sum = getNumber()
        //tvText1?.setText(sum.toString() )
        //tvText2?.setText(number1.toString() )
        var subText:String = text.substringAfter('<')
        var subText2:String = subText.substringBefore('>')
        var subText3:String = text.substringAfter('>')
        tvText1?.setText(subText2)
        var subText4:String = subText3.substringAfter('<')
        var subText5:String = subText4.substringBefore('>')
        tvText2?.setText(subText5)
    }

    private fun getNumber():Int{
        return number1 * number2
    }


}