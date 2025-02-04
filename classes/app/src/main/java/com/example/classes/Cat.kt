package com.example.classes

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Year
import java.util.Calendar

class Cat(
    val name: String,
    val birthYear: Int,
    val interests: MutableList<String>
) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - birthYear
}