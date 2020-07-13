package com.appgrouplab.code.kotlin.uuid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVersion3.setOnClickListener {
            txtVersion3.text = UUIDUtil().getVersion3NameSpace(edtNameSpace.text.toString(), UUIDUtil.UTF8)
        }

        btnVersion4.setOnClickListener {
            txtVesrion4.text = UUIDUtil().getVersion4()
        }

    }
}