package isomora.com.greendoctor
import android.os.Bundle
import android.widget.Toast
import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.os.Build
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.activity_main.*;
import java.io.IOException

class Grape : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //Grape = findViewById(R.id.Grape)
        Grape.setOnClickListener {

            // var i = Intent(this, Activity2::class.java)
            //startActivity(i)
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
            // finish()

        }


    }

}