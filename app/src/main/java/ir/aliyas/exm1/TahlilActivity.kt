package ir.aliyas.exm1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import ir.aliyas.exm1.databinding.ActivityTahlilBinding

class TahlilActivity : AppCompatActivity() {
    lateinit var binding: ActivityTahlilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTahlilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarmain)

        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        binding.bio1.setOnClickListener {

            openWebsite("https://uploadb.me/38d6ed822lz8/TestZist1.pdf.html]TestZist1.pdf ")

        }
    }

    private fun openWebsite(uri: String) {

        val intent =Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        startActivity(intent)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId ==android.R.id.home){
            onBackPressed()
        }

        return true
    }
}