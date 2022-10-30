package com.kuderitest.kokoa_talk_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        admin@genie.com / asdf1234
        val myUserId = "admin@genie.com"
        val myUserPw = "asdf1234"
//        로그인 버튼 클릭시
        login_btn.setOnClickListener {
            //아이디, 비번 확인
            val inputId = kokoa_id.text.toString()
            val inputPw = kokoa_pw.text.toString()
            if(inputId == myUserId && inputPw == myUserPw){
                val name = "안드로이드 쿠쿠"

               Toast.makeText(this, "${name} 입니다.",  Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "로그인 실패",  Toast.LENGTH_SHORT).show()
            }
        }
    }
}