package com.theo.finalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvCats: RecyclerView
    private var title: String = "Jenis Kucing"
    private var list: ArrayList<Cat> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvCats = findViewById(R.id.rv_cats)
        rvCats.setHasFixedSize(true)

        list.addAll(CatsData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvCats.layoutManager = LinearLayoutManager(this)
        val listCatAdapter = ListCatAdapter(list)
        rvCats.adapter = listCatAdapter

        listCatAdapter.setOnItemClickCallback(object : ListCatAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Cat) {
                showSelectedCat(data)
            }
        })
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_about -> {
                showAboutMe()
            }
        }
    }
    private fun showAboutMe(){
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    private fun showSelectedCat(cat: Cat) {
        Toast.makeText(this, "Kamu memilih " + cat.name, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("img", cat.photo)
        intent.putExtra("name", cat.name)
        intent.putExtra("desc", cat.detail)

        startActivity(intent)
    }
}