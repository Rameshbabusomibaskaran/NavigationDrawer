package com.example.navigationdrawer

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.view.LayoutInflater
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snackbar.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T




class Snackbar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)


        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = this.layoutInflater
            val view: View = inflater.inflate(R.layout.activity_main, null)
            builder.setView(view)

            button.setOnClickListener(View.OnClickListener {
                // Pass the mDialogView to the SnackBar
                Snackbar
                    .make(view, "SnackBar in Dialog", Snackbar.LENGTH_LONG)
                    .show()
            })
        }
    }
}
