package com.example.broadcastreceiversandservicesproject

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun startService() {
        val serviceIntent =  Intent(this, MusicForegroundService::class.java)
        serviceIntent.putExtra("inputExtra", "Playing: Shanti by Roboos")
        ContextCompat.startForegroundService(this,serviceIntent)

    }


    fun onClick(view: View) {

        when(view.id){

            R.id.btnStartService -> startService()


            R.id.btnPopulateRecyclerVeiw -> {

                val jojoList = arrayListOf<String>()




            }





        }


    }

    fun populateRecyclerVeiw ():ArrayList<Jojo>{
        var curNum = 0
        var newReturnList = ArrayList<Jojo>()
        val returnList = ArrayList<Jojo>()
        returnList.add(Jojo("Jonathan","N/A","DIO!","Phantom Blood"))
        returnList.add(Jojo("Joseph","Hermit Purple","Your next line is...","Battle Tendency"))
        returnList.add(Jojo("Jotaro","Star Platinum","Yare yare daze","Stardust Crusaders"))
        returnList.add(Jojo("Josuke","Crazy Diamond","What did you say about my hair?!","Diamond Is Unbreakable"))
        returnList.add(Jojo("Giorno","Gold Experience","I, Gio, have a dream!","Golden Wind"))
        returnList.add(Jojo("Jolyne","Stone Free","Yare yare dawa","Stone Ocean"))
        returnList.add(Jojo("Johnny","N/A","Thank you Gyro","Steel Ball Run"))
        returnList.add(Jojo("Josefumi","Soft & Wet","I win...completely!","Jojolion"))

        val random =  (0..10).random()
        for (i in 0..3){
            newReturnList.add(returnList[random])
        }
     return newReturnList
    }
}
