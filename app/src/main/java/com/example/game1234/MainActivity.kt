package com.example.game1234

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.core.view.children
import com.example.game1234.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            ActivityMainBinding.inflate(layoutInflater) // с помощью этого метода мы в переменную
        // val binding загоняем всю разметку. затем ее передаем в setContentView(binding.root)
        // root - это значит корнивой лаяут. Предварительно в build.gradle.kts в android
        //вписываем buildFeatures { viewBinding = true }, т.е. подключаем специальную библиотеку.
        setContentView(binding.root)

        val mapColorButton = mapOf(
            1 to getColor(R.color.violet),
            2 to getColor(R.color.green),
            3 to getColor(R.color.orange),
            4 to getColor(R.color.red),
            5 to getColor(R.color.blue),
            6 to getColor(R.color.violet),
            7 to getColor(R.color.yellow)
        )

        val listButtons = mutableListOf(
            mutableListOf(
                binding.button00,
                binding.button01,
                binding.button02,
                binding.button03,
                binding.button04
            ),
            mutableListOf(
                binding.button10,
                binding.button11,
                binding.button12,
                binding.button13,
                binding.button14
            ),
            mutableListOf(
                binding.button20,
                binding.button21,
                binding.button22,
                binding.button23,
                binding.button24
            ),
            mutableListOf(
                binding.button30,
                binding.button31,
                binding.button32,
                binding.button33,
                binding.button34
            ),
            mutableListOf(
                binding.button40,
                binding.button41,
                binding.button42,
                binding.button43,
                binding.button44
            )
        )

        fun initMatrix(): MutableList<MutableList<Int>> {
            // Этот метод создает матрицу значений для кнопок игравого поля
            var listMatrix = mutableListOf<MutableList<Int>>()

            for (i in 0..4) (
                    listMatrix.add(MutableList(5) { (1..5).random() })
                    )
            println(listMatrix)
            return listMatrix
        }

        var gameMatrix = initMatrix() // записываем матрицу значений в переменну.

        fun viewField(mutableList: MutableList<MutableList<Int>>) {
            // Этод метод должен передавать значения матрицы кнопкам игравого поля.
            for (i in 0..4) {
                listButtons[i].zip(mutableList[i]) { btn: Button, vle: Int ->
                    btn.text = vle.toString();
                    var color = mapColorButton[vle]
                    btn.setBackgroundColor(color)
                }
            }
        }
        viewField(gameMatrix)
    }
}