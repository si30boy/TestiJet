package ir.aliyas.exm1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import ir.aliyas.exm1.databinding.ActivityHomeBinding





class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding

    // var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarmain)


        val addTransaction =supportFragmentManager.beginTransaction()
        addTransaction.replace(R.id.drawerlayout_main,FragmentAdvertise())
        addTransaction.commit()










        binding.playQuizHomeBtn0.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
            setSupportActionBar(binding.toolbarmain)
        }
        binding.playQuizHomeBtn1.setOnClickListener {
            val intent2 = Intent(this, PlayActivity3::class.java)
            startActivity(intent2)
            setSupportActionBar(binding.toolbarmain)
        }

        binding.playQuizHomeBtn2.setOnClickListener {
            val intent3 = Intent(this, PlayActivity2::class.java)
            startActivity(intent3)
            setSupportActionBar(binding.toolbarmain)
        }
        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.drawerlayoutMain,
            binding.toolbarmain,
            R.string.OpenDrawer,
            R.string.CloseDrawer
        )
        binding.drawerlayoutMain.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        binding.navigationviewMain.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_tahlil -> {
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)

                    val intent =Intent(this,TahlilActivity::class.java)
                    startActivity(intent)


                }


                R.id.menu_podCast -> {




                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)


                }

                R.id.menu_jozve -> {
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)

                }
                R.id.menu_telegram ->{
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                }




            }



            true
        }



    }

    private fun openWebsite(url: String) {
        val intent =Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)

    }
}

