package com.example.final2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        usernameEditText = findViewById(R.id.username_edit_text)
        passwordEditText = findViewById(R.id.password_edit_text)

        // Liên kết button_login với hàm onLoginClick()
        val buttonLogin = findViewById<Button>(R.id.login_button)
        buttonLogin.setOnClickListener(this::onLoginClick)
    }

    fun onLoginClick(view: View) {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (username == "admin" && password == "123") {
            val newUserIntent = Intent(this, MainActivity::class.java)
            startActivity(newUserIntent)
        } else {
            // Hiển thị thông báo lỗi
            Toast.makeText(this, "Tài khoản hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show()
        }
    }
}