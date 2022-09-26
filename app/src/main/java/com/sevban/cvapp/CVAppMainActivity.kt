package com.sevban.cvapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sevban.cvapp.ui.theme.CvAppTheme

class CVAppMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CvAppTheme {

            }
        }
    }
}
