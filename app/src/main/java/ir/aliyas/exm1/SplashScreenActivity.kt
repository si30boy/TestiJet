package ir.aliyas.exm1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)



        Handler().postDelayed({
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)

            finish()
        }, 2000)



    }
}