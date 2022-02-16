package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_addTasks -> {
                val intent = Intent(this, TaskActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_rating -> {
                showDialogBox()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }


    }

    private fun showDialogBox(): Unit {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Please rate us!")
        builder.setView(R.layout.customratingbar)

        builder.setPositiveButton("Yes"){dialogInterface, which ->
            Toast.makeText(applicationContext,   "provided rating",Toast.LENGTH_LONG).show()
        }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()


    }

}