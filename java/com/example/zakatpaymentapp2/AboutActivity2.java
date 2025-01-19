package com.example.zakatpaymentapp2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);

        // Enable the up button for navigating back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // This line enables the up button

        // Link GitHub TextView
        TextView githubLink = findViewById(R.id.githubLink);

        // Set click listener to open GitHub repository
        githubLink.setOnClickListener(v -> {
            String githubUrl = "https://github.com/yourusername/ZakatPaymentApp2"; // Replace with your actual GitHub URL
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl));
            startActivity(intent);
        });
    }

    // Handle the up navigation button click
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // This will handle the back navigation
        return true;
    }
}
