package com.example.kotlin200

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    //액티비티가 생성되었을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //레이아웃 설정
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
    }
}