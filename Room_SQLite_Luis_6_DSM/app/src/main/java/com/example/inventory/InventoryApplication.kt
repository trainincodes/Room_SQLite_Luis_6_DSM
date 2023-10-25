package com.example.inventory

import android.app.Application
import com.example.inventory.data.AppContainer
import com.example.inventory.data.AppDataContainer

class InventoryApplication : Application() {

    val container: AppContainer by lazy {
        AppDataContainer(this)
    }

    override fun onCreate() {
        super.onCreate()
    }
}
