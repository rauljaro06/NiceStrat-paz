package com.example.nicestrat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        ImageView mSea = findViewById(R.id.backView);

        Glide.with(this)
                .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
                //.transition(DrawableTransitionOptions.withCrossFade())
                .centerCrop()
                //.diskCacheStrategy(DiskCacheStrategy.ALL)
                //.placeholder(new ColorDrawable(this.getResources().getColor()))
                .into(mSea);

    }

    public void openMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openSingup(View v){
        Intent intent = new Intent(this, SingUp.class);
        startActivity(intent);
    }
}