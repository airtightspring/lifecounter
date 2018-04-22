package lifecounter.kjerauld.washington.edu.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    protected lateinit var awesomeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Player 1
        //      Plus 1
        onClick(findViewById(R.id.button6), findViewById(R.id.textView5), 1, findViewById(R.id.textView2))
        //      Plus 5
        onClick(findViewById(R.id.button7), findViewById(R.id.textView5), 5, findViewById(R.id.textView2))
        //      Minus 1
        onClick(findViewById(R.id.button5), findViewById(R.id.textView5), -1, findViewById(R.id.textView2))
        //      Minus 5
        onClick(findViewById(R.id.button9), findViewById(R.id.textView5), -5, findViewById(R.id.textView2))

        // Player 2
        //      Plus 1
        onClick(findViewById(R.id.button2), findViewById(R.id.textView4), 1, findViewById(R.id.textView))
        //      Plus 5
        onClick(findViewById(R.id.button4), findViewById(R.id.textView4), 5, findViewById(R.id.textView))
        //      Minus 1
        onClick(findViewById(R.id.button3), findViewById(R.id.textView4), -1, findViewById(R.id.textView))
        //      Minus 5
        onClick(findViewById(R.id.button), findViewById(R.id.textView4), -5, findViewById(R.id.textView))

        // Player 3
        //      Plus 1
        onClick(findViewById(R.id.button10), findViewById(R.id.textView10), 1, findViewById(R.id.textView9))
        //      Plus 5
        onClick(findViewById(R.id.button11), findViewById(R.id.textView10), 5, findViewById(R.id.textView9))
        //      Minus 1
        onClick(findViewById(R.id.button14), findViewById(R.id.textView10), -1, findViewById(R.id.textView9))
        //      Minus 5
        onClick(findViewById(R.id.button13), findViewById(R.id.textView10), -5, findViewById(R.id.textView9))

        // Player 4
        //      Plus 1
        onClick(findViewById(R.id.button15), findViewById(R.id.textView7), 1, findViewById(R.id.textView8))
        //      Plus 5
        onClick(findViewById(R.id.button16), findViewById(R.id.textView7), 5, findViewById(R.id.textView8))
        //      Minus 1
        onClick(findViewById(R.id.button8), findViewById(R.id.textView7), -1, findViewById(R.id.textView8))
        //      Minus 5
        onClick(findViewById(R.id.button17), findViewById(R.id.textView7), -5, findViewById(R.id.textView8))
    }

    fun onClick(button: Button, viewer: TextView, myNumber: Int, playerView: TextView) {
        button.setOnClickListener {
            val viewerNum = viewer.text.toString().toInt()
            val zero = 0
            if(viewerNum + myNumber <= zero) {
                viewer.text = zero.toString()
                val displayText = playerView.text.toString() + " loses!"
                Toast.makeText(this, displayText, Toast.LENGTH_SHORT).show()
            } else {
                viewer.text = (viewerNum + myNumber).toString()
            }
        }
    }

}