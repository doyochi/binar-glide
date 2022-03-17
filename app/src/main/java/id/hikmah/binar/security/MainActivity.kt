package id.hikmah.binar.security

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        Log.e(MainActivity::class.java.simpleName, "onCreate() Dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.e(MainActivity::class.java.simpleName, "onStart() Dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.e(MainActivity::class.java.simpleName, "onResume() Dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.e(MainActivity::class.java.simpleName, "onPause() Dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.e(MainActivity::class.java.simpleName, "onStop() Dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(MainActivity::class.java.simpleName, "onRestart() Dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(MainActivity::class.java.simpleName, "onDestroy() Dijalankan")
    }

}

/*
* Ketika orientasi diubah menjadi landscape dan sebaliknya, ada serangkaian activity lifecycle yang dijalankan.
* Berikut adalah list secara berurutan:
* 1. onPause()
* 2. onDestroy()
* 3. onCreate()
* 4. onStart()
* 5. onResume()
*
* Menurut pengamatan saya, ketika orientasi diubah, maka aplikasi akan menjalankan serangkaian berikut onPause->onStop->onDestroy untuk menghentikan tampilan saat ini
* kemudian akan dijalankan kembali secara berurutan onCreate->onStart->onResume() untuk menampilkan kembali dengan orientasi yang telah dirubah
* */