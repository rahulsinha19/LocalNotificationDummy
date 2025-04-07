package com.sinharahul.localnotificationdummy.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sinharahul.localnotificationdummy.platform.NotificationManager
import kotlinx.coroutines.launch

class HomeScreenViewModel(
    private val notificationManager: NotificationManager
): ViewModel() {
    fun executeNotification() {
        viewModelScope.launch {
            notificationManager.showNotification(
                title = "Hello",
                description = "This is a test notification"
            )
        }
    }
}
