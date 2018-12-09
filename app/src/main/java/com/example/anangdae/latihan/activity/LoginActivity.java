package com.example.anangdae.latihan.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.anangdae.latihan.R;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button login;
    private TextView register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btn_login);
        register = findViewById(R.id.tv_register);


        login.setOnClickListener(this);
        register.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                StringRequest stringRequest = new StringRequest(Request.Method.POST, AppVar.LOGIN_URL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                //If we are getting success from server
                                if (response.contains(AppVar.LOGIN_URL)) {
                                   

                                } else {
                                    //Displaying an error message on toast
                                   Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                //You can handle error here if you want;
                                Toast.makeText(LoginActivity.this, "The server unreachable", Toast.LENGTH_LONG).show();

                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<>();
                        //Adding parameters to request

                        //returning parameter
                        return params;
                    }
                };
                break;
            case R.id.tv_register:
                Intent A = new Intent(this, RegisterActivity.class);
                startActivity(A);
                break;
        }
    }
}
