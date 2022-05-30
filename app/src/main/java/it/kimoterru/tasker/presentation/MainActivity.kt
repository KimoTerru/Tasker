package it.kimoterru.tasker.presentation

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import it.kimoterru.tasker.R
import it.kimoterru.tasker.databinding.ActivityMainBinding
import it.kimoterru.tasker.presentation.util.FragmentNavigation

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding(CreateMethod.INFLATE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupFullScreenActivity(window)
        if (savedInstanceState == null) {
            val navigation by lazy {
                FragmentNavigation(
                    R.id.fragment_container_view,
                    supportFragmentManager
                )
            }
            navigation.toHome()
        }
    }

    private fun setupFullScreenActivity(window: Window) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}