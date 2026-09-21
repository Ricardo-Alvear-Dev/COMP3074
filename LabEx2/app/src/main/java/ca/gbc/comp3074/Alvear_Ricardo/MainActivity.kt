package ca.gbc.comp3074.Alvear_Ricardo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private var stepValue = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvOutput = findViewById<TextView>(R.id.tvOutput)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnStep = findViewById<Button>(R.id.btnStep)

        fun updateDisplay() {
            tvOutput.text = count.toString()
        }

        // Increase count based on current step behavior
        btnAdd.setOnClickListener {
            count += stepValue
            updateDisplay()
        }

        // Decrease count based on current step behavior
        btnSubtract.setOnClickListener {
            count -= stepValue
            updateDisplay()
        }

        // Toggle step behavior between 1 and 2
        btnStep.setOnClickListener {
            stepValue = if (stepValue == 1) 2 else 1
        }

        // Reset output to zero and restore default step behavior (1)
        btnReset.setOnClickListener {
            count = 0
            stepValue = 1
            updateDisplay()
        }
    }
}