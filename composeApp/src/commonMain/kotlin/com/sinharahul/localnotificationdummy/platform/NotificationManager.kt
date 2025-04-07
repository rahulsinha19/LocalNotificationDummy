package com.sinharahul.localnotificationdummy.platform

expect class NotificationManager {
    fun showNotification(
        title: String,
        description: String
    )
}
