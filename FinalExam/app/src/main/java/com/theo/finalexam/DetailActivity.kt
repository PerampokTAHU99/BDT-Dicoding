package com.theo.finalexam

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private var title: String = "Detail"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        var intentMain : Intent
        intentMain = getIntent()

        val img : ImageView = findViewById(R.id.img)
        var name : TextView = findViewById(R.id.name)
        var desc : TextView = findViewById(R.id.desc)

        img.setImageDrawable(getResources().getDrawable(intentMain.getIntExtra("img", R.drawable.ic_launcher_background)))
        name.text = intentMain.getStringExtra("name")
        desc.text = intentMain.getStringExtra("desc")
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}