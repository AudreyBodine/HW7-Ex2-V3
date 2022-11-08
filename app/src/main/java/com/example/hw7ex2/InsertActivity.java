package com.example.hw7ex2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class InsertActivity extends AppCompatActivity {

    private DatabaseManager dbManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbManager = new DatabaseManager(this);
        setContentView(R.layout.activity_insert);
    }

    public void insert(View view) {

        // Retrieve name and price

        Log.w("InsertActivity", "Insert Button Pushed");
        EditText fNameET = findViewById(R.id.first_nameET);
        EditText lNameET = findViewById(R.id.last_nameET);
        EditText emailET = findViewById(R.id.email_ET);
        String fName = fNameET.getText().toString();
        String lName = lNameET.getText().toString();
        String email = emailET.getText().toString();

        // Insert into database
        try {
            Friends friends = new Friends(0, fName, lName, email);
            dbManager.insert(friends);
            Toast.makeText(this, "Friend Added", Toast.LENGTH_SHORT).show();
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, "Entry Error", Toast.LENGTH_SHORT).show();
        }
        // Clear data
        fNameET.setText("");
        lNameET.setText("");
        emailET.setText("");
    }

    public void goBack(View view) {
        this.finish();

    }
}


