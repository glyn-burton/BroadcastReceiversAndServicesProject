package com.example.broadcastreceiversandservicesproject

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class RecycleVeiwBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        TODO("RecycleVeiwBroadcast.onReceive() is not implemented")
    }
}


interface broadcastCallback{

    fun passInfoToRV(passedValue : ArrayList<Jojo>)


}