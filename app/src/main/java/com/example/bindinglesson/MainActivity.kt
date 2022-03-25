package com.example.bindinglesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonWriter
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
//import com.example.bindinglesson.databinding.ActivityMainBinding
import com.mashape.unirest.http.Unirest
import org.jetbrains.anko.activityUiThread
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.json.JSONException
import org.json.JSONObject
import org.json.JSONStringer
import kotlin.random.Random

//lateinit var bindingClass: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        doAsync {
            var responce = Unirest.get("https://random-words5.p.rapidapi.com/getRandom")
                .header("X-RapidAPI-Host", "random-words5.p.rapidapi.com")
                .header("X-RapidAPI-Key", "dfd13661dbmsh0610c2e8200745dp19acd2jsn8894c165bbc9")
                .asString();
            var all = responce.body

            activityUiThread {
                var text = findViewById<TextView>(R.id.changeText)
                text.text = all.toString()
            }
            //fun onCLickChange(view: View) {
//          var list = listOf("few words","edwdw","sdasda","asdadasdsa", "rfweewf")
//          text = bindingClass.changeText
//          var randomIndex = Random.nextInt(list.size)}

        }

    }

    fun onClcChange(view: View){
        doAsync {
            var responce = Unirest.get("https://random-words5.p.rapidapi.com/getRandom")
                .header("X-RapidAPI-Host", "random-words5.p.rapidapi.com")
                .header("X-RapidAPI-Key", "dfd13661dbmsh0610c2e8200745dp19acd2jsn8894c165bbc9")
                .asString();
            var all = responce.body

            activityUiThread {
                var text = findViewById<TextView>(R.id.changeText)
                text.text = all.toString()
            }
            //fun onCLickChange(view: View) {
//          var list = listOf("few words","edwdw","sdasda","asdadasdsa", "rfweewf")
//          text = bindingClass.changeText
//          var randomIndex = Random.nextInt(list.size)}

        }

    }

}

