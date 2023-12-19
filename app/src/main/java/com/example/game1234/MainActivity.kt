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
            1 to R.color.white,
            2 to R.color.green,
            3 to R.color.orange,
            4 to R.color.red,
            5 to R.color.blue,
            6 to R.color.violet,
            7 to R.color.yellow
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
            return listMatrix
        }


        fun viewField(mutableList: MutableList<MutableList<Int>>) {
            // Этод метод должен передавать значения матрицы кнопкам игравого поля.
            for (i in 0..4) {
                listButtons[i].zip(mutableList[i]) { btn: Button, vle: Int ->
                    btn.text = vle.toString()
                    var colorr = mapColorButton.getOrDefault(vle, getColor(R.color.yellow))
                    btn.setBackgroundColor(getColor(colorr))
                }
            }
        }


        var gameMatrix = initMatrix() // записываем матрицу значений в переменну.
        viewField(gameMatrix)

        fun listenerCounter() {
            binding.button00.setOnClickListener {
                if (gameMatrix[0][0] < 7) {
                    gameMatrix[0][0]++
                    viewField(gameMatrix)
                }
            }
            binding.button01.setOnClickListener {
                if (gameMatrix[0][1] < 7) {
                    gameMatrix[0][1]++
                    viewField(gameMatrix)
                }
            }
            binding.button02.setOnClickListener {
                if (gameMatrix[0][2] < 7) {
                    gameMatrix[0][2]++
                    viewField(gameMatrix)
                }
            }
            binding.button03.setOnClickListener {
                if (gameMatrix[0][3] < 7) {
                    gameMatrix[0][3]++
                    viewField(gameMatrix)
                }
            }
            binding.button04.setOnClickListener {
                if (gameMatrix[0][4] < 7) {
                    gameMatrix[0][4]++
                    viewField(gameMatrix)
                }
            }
            binding.button10.setOnClickListener {
                if (gameMatrix[1][0] < 7) {
                    gameMatrix[1][0]++
                    viewField(gameMatrix)
                }

            }
            binding.button11.setOnClickListener {
                if (gameMatrix[1][1] < 7) {
                    gameMatrix[1][1]++
                    viewField(gameMatrix)
                }
            }
            binding.button12.setOnClickListener {
                if (gameMatrix[1][2] < 7) {
                    gameMatrix[1][2]++
                    viewField(gameMatrix)
                }
            }
            binding.button13.setOnClickListener {
                if (gameMatrix[1][3] < 7) {
                    gameMatrix[1][3]++
                    viewField(gameMatrix)
                }
            }
            binding.button14.setOnClickListener {
                if (gameMatrix[1][4] < 7) {
                    gameMatrix[1][4]++
                    viewField(gameMatrix)
                }
            }
            binding.button20.setOnClickListener {
                if (gameMatrix[2][0] < 7) {
                    gameMatrix[2][0]++
                    viewField(gameMatrix)
                }

            }
            binding.button21.setOnClickListener {
                if (gameMatrix[2][1] < 7) {
                    gameMatrix[2][1]++
                    viewField(gameMatrix)
                }
            }
            binding.button22.setOnClickListener {
                if (gameMatrix[2][2] < 7) {
                    gameMatrix[2][2]++
                    viewField(gameMatrix)
                }
            }
            binding.button23.setOnClickListener {
                if (gameMatrix[2][3] < 7) {
                    gameMatrix[2][3]++
                    viewField(gameMatrix)
                }
            }
            binding.button24.setOnClickListener {
                if (gameMatrix[2][4] < 7) {
                    gameMatrix[2][4]++
                    viewField(gameMatrix)
                }
            }
            binding.button30.setOnClickListener {
                if (gameMatrix[3][0] < 7) {
                    gameMatrix[3][0]++
                    viewField(gameMatrix)
                }

            }
            binding.button31.setOnClickListener {
                if (gameMatrix[3][1] < 7) {
                    gameMatrix[3][1]++
                    viewField(gameMatrix)
                }
            }
            binding.button32.setOnClickListener {
                if (gameMatrix[3][2] < 7) {
                    gameMatrix[3][2]++
                    viewField(gameMatrix)
                }
            }
            binding.button33.setOnClickListener {
                if (gameMatrix[3][3] < 7) {
                    gameMatrix[3][3]++
                    viewField(gameMatrix)
                }
            }
            binding.button34.setOnClickListener {
                if (gameMatrix[3][4] < 7) {
                    gameMatrix[3][4]++
                    viewField(gameMatrix)
                }
            }
            binding.button40.setOnClickListener {
                if (gameMatrix[4][0] < 7) {
                    gameMatrix[4][0]++
                    viewField(gameMatrix)
                }
            }
            binding.button41.setOnClickListener {
                if (gameMatrix[4][1] < 7) {
                    gameMatrix[4][1]++
                    viewField(gameMatrix)
                }
            }
            binding.button42.setOnClickListener {
                if (gameMatrix[4][2] < 7) {
                    gameMatrix[4][2]++
                    viewField(gameMatrix)
                }
            }
            binding.button43.setOnClickListener {
                if (gameMatrix[4][3] < 7) {
                    gameMatrix[4][3]++
                    viewField(gameMatrix)
                }
            }
            binding.button44.setOnClickListener {
                if (gameMatrix[4][4] < 7) {
                    gameMatrix[4][4]++
                    viewField(gameMatrix)
                }
            }
        }
        listenerCounter()
    }
}