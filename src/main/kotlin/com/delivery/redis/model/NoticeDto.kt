package com.delivery.redis.model

import java.io.Serializable

data class NoticeDto (
    var id: Long ? = 1,
    var notice: String?=null
): Serializable