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

        fun viewField(gameMatrix: MutableList<Int>) {
            // Этод метод должен передавать значения матрицы кнопкам игравого поля.
            var list0 = gameMatrix[0] // пытаюсь облегчить работу zip. из списка списков
            // делаю простой список с интами. НЕ ПОМОГЛО ((
            var listButton0 = listOf( //список кнопок
                binding.button00,
                binding.button01,
                binding.button02,
                binding.button03,
                binding.button04
            )
            listButton0.zip(list0) { x: Button, y: Int -> x.text = y.toString() }
            // пытаюсь итерироваться по двум спискам и провзаимодейтвовать элементами.
            // НЕ ПОЛУЧАЕТСЯ! НЕ понимаю почему. ((
        }
    }
}