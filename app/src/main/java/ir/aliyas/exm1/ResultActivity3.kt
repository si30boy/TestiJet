package ir.aliyas.exm1

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ir.aliyas.exm1.databinding.ActivityResult2Binding
import ir.aliyas.exm1.databinding.ActivityResult3Binding


class ResultActivity3 : AppCompatActivity() {
    private lateinit var activityResult3Binding: ActivityResult3Binding
    var totalScore = 0
    var correct = 0
    var wrong = 0
    var skip = 0
    var isKey = false
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityResult3Binding = ActivityResult3Binding.inflate(layoutInflater)
        setContentView(activityResult3Binding.root)
        totalScore = intent.extras!!.getInt("درست")
        wrong = intent.extras!!.getInt("نادرست")
        skip = intent.extras!!.getInt("skip")
        initializeViews()
    }
    @SuppressLint("SetTextI18n")
    private fun initializeViews() {
        activityResult3Binding.apply {
            tvScore.text = "امتیاز: $totalScore"
            tvright.text = "درست: $totalScore"
            tvwrong.text = "نادرست: $wrong"
            tvSkip.text = "Skip: $skip"
            if (totalScore >= 15) {
                activityResult3Binding.emojiReactionImg.setImageResource(R.drawable.img_smile)
                Toast.makeText(this@ResultActivity3, "بی نظیر", Toast.LENGTH_LONG).show()
            } else {
                emojiReactionImg.setImageResource(R.drawable.img_angry)
                Toast.makeText(this@ResultActivity3, "نیاز به تلاش بیشتر", Toast.LENGTH_LONG).show()
            }
            tvPlayAgain.setOnClickListener {
                finish()
            }
            activityResult3Binding.btnTahlil.setOnClickListener {
                val uri1 ="https://uploadb.me/38d6ed822lz8/TestZist1.pdf.html]TestZist1.pdf "
                val intent =Intent(Intent.ACTION_VIEW, Uri.parse(uri1))
                startActivity(intent)
            }

            }
        }
    }

