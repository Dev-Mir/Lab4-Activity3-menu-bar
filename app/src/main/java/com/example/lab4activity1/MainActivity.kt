package com.example.lab4activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.search){
            Toast.makeText(this, "Searched", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.upload){
            Toast.makeText(this, "Uploaded", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.copy){
            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.print){
            Toast.makeText(this, "Printed", Toast.LENGTH_SHORT).show()
        }


        if (item.itemId == R.id.share){
            Toast.makeText(this, "Shared", Toast.LENGTH_SHORT).show()
        }

        if (item.itemId == R.id.bookmark){
            Toast.makeText(this, "Book Marked", Toast.LENGTH_SHORT).show()
        }

        return true

    }

}