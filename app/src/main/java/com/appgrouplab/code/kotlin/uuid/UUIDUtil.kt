package com.appgrouplab.code.kotlin.uuid

import java.nio.charset.Charset
import java.util.*

class UUIDUtil {

    companion object{
        val UTF8 = Charsets.UTF_8
    }

    fun getVersion4(): String{
        return UUID.randomUUID().toString()
    }

    fun getVersion3NameSpace(namespace: String, charset: Charset): String{
        val nameSpaceBytes: ByteArray = namespace.toByteArray(charset)
        return UUID.nameUUIDFromBytes(nameSpaceBytes).toString()
    }
}