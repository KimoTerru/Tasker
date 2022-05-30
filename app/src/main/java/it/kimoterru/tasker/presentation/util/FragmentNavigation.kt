package it.kimoterru.tasker.presentation.util

import androidx.fragment.app.FragmentManager
import it.kimoterru.tasker.presentation.home.HomeFragment

class FragmentNavigation(
    private val container: Int,
    private val supportFragmentManager: FragmentManager
) {

    fun toHome() {
        supportFragmentManager.beginTransaction().add(container, HomeFragment::class.java, null)
            .commit()
    }
}