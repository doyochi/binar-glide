package id.hikmah.binar.security

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.viewbinding.library.activity.viewBinding
import com.bumptech.glide.Glide
import id.hikmah.binar.security.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnLoadImage.setOnClickListener {
            Glide.with(this)
                .load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.ivBinar)
        }
    }

}