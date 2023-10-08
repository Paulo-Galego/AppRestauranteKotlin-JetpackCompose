package com.galego.apprestaurantekotlin_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.galego.apprestaurantekotlin_jetpackcompose.list_item.FoodItem
import com.galego.apprestaurantekotlin_jetpackcompose.model.Food

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
         FoodList()
        }
    }
}

@Composable
private fun FoodList(){
    val foodList: MutableList<Food> = mutableListOf(
        Food(
            imgFood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription = "Arroz, feijão, batata frita e filé de frango. Salada de alface e tomate.",
            price = "R$ 30.00"
        ),
        Food(
            imgFood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription = "Arroz, feijão, batata frita e filé de frango. Salada de alface e tomate.",
            price = "R$ 80.00"
        ),
        Food(
            imgFood = R.drawable.food3,
            foodName = "Food 3",
            foodDescription = "Arroz, feijão, batata frita e filé de frango. Salada de alface e tomate.",
            price = "R$ 70.00"
        ),
        Food(
            imgFood = R.drawable.food4,
            foodName = "Food 4",
            foodDescription = "Arroz, feijão, batata frita e filé de frango. Salada de alface e tomate.",
            price = "R$ 90.00"
        ),
        Food(
            imgFood = R.drawable.food5,
            foodName = "Food 5",
            foodDescription = "Arroz, feijão, batata frita e filé de frango. Salada de alface e tomate.",
            price = "R$ 95.00"
        ),
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn{
            itemsIndexed(foodList){position, food ->
                FoodItem(food)
            }
        }
    }
}