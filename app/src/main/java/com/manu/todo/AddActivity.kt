package com.manu.todo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.EditText
import java.util.*

class AddActivity : AppCompatActivity() {

    var year = 1000
    var month = 10
    var day = 30
    var hour = 12
    var min = 60



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)


    }

    override fun onResume() {
        super.onResume()

        val title = findViewById<EditText>(R.id.title)
        val activityTitle = title.text.toString()

        val currCalendar = Calendar.getInstance()
        val zone = TimeZone.getDefault()
        currCalendar.timeZone

        year = currCalendar.get(Calendar.YEAR)
        month = currCalendar.get(Calendar.MONTH)
        day = currCalendar.get(Calendar.DAY_OF_MONTH)
        hour = currCalendar.get(Calendar.HOUR_OF_DAY)
        min = currCalendar.get(Calendar.MINUTE)

        val datePick = findViewById<DatePicker>(R.id.date_picker)
        datePick.init(year - 1, month + 1, day + 5, DatePicker.OnDateChangedListener { datePick, year, month, day ->

        })

    }
}
