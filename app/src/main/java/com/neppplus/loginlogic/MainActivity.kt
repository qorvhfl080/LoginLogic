package com.neppplus.loginlogic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginRecord: String = ""

        loginBtn.setOnClickListener {

            val inputId = idEdt.text.toString()
            val inputPassword = passwordEdt.text.toString()


            if (inputId == "admin" && inputPassword == "qwer") {
                idEdt.setText("")
                passwordEdt.setText("")

                loginRecord += "로그인 성공\n"
                loginTxt.text = loginRecord

                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            } else {
                loginRecord += "로그인 실패\n"
                loginTxt.text = loginRecord

                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }

        }


    }


}