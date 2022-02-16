package com.example.splashscreen

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class AlarmBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var mp = MediaPlayer.create(context, R.raw.ringtone)
        mp.start()
        Toast.makeText(context, "Alarm Ringing", Toast.LENGTH_LONG).show()

    }
}