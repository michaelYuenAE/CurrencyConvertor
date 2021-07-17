package com.michaelyuen.codingchallenge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.michaelyuen.codingchallenge.network.ApiService
import com.michaelyuen.codingchallenge.network.RetrofitManager
import com.michaelyuen.codingchallenge.presentation.mainViewModel
import java.util.logging.Logger


const val accessKey = "a6df36d9ac64d1ba3b4be8f9cd4a8b3f"
class MainActivity : AppCompatActivity() {
    var myAPIService: ApiService? = null

    private lateinit var mViewModel: mainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myAPIService = RetrofitManager.instance.getAPI();
        var jsonObject = myAPIService?.getCurrencyData(accessKey)
        Logger.getLogger("MainActivity").info("$jsonObject")
    }
}