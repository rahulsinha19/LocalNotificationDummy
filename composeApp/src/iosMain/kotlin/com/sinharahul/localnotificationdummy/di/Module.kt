package com.sinharahul.localnotificationdummy.di

import com.sinharahul.localnotificationdummy.platform.NotificationManager
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single { NotificationManager() }
}
