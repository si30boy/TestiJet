package ir.aliyas.exm1

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ir.aliyas.exm1.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var activityResultBinding: ActivityResultBinding
    var totalScore = 0
    var correct = 0
    var wrong = 0
    var skip = 0
    var isKey = false
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityResultBinding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(activityResultBinding.root)
        totalScore = intent.extras!!.getInt("درست")
        wrong = intent.extras!!.getInt("نادرست")
        skip = intent.extras!!.getInt("skip")
        initializeViews()
    }
    @SuppressLint("SetTextI18n")
    private fun initializeViews() {
        activityResultBinding.apply {
            tvScore.text = "امتیاز: $totalScore"
            tvright.text = "درست: $totalScore"
            tvwrong.text = "نادرست: $wrong"
            tvSkip.text = "Skip: $skip"
            if (totalScore >= 15) {
                activityResultBinding.emojiReactionImg.setImageResource(R.drawable.img_smile)
                Toast.makeText(this@ResultActivity, "Wow Great", Toast.LENGTH_SHORT).show()
            } else {
                emojiReactionImg.setImageResource(R.drawable.img_angry)
                Toast.makeText(this@ResultActivity, "Need Improvement", Toast.LENGTH_SHORT).show()
            }
            tvPlayAgain.setOnClickListener {
                finish()
            }
            activityResultBinding.btnTahlil.setOnClickListener {
                val uri1 ="\"https://uploadb.me/38d6ed822lz8/TestZist1.pdf.html]TestZist1.pdf \""
                val intent2 =Intent(Intent.ACTION_VIEW, Uri.parse(uri1))
                startActivity(intent2)
            }
        }
    }
}
