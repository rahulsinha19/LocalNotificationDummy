package com.sinharahul.localnotificationdummy

import android.app.Application
import com.sinharahul.localnotificationdummy.di.KoinInit
import com.sinharahul.localnotificationdummy.di.viewModelModule
import org.koin.android.ext.koin.androidContext

class LocalNotificationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInit().init {
            androidContext(this@LocalNotificationApp)
            modules(listOf(viewModelModule))
        }
    }
}
