package com.thuchanh.noactivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HelloAndroid extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_android);

        Toast.makeText(this, "Hien thi Toast", Toast.LENGTH_SHORT).show();

        TextView displayLine = findViewById(R.id.display_line);
        // Truy xuất dữ liệu trong bộ nhớ Asseets trong android
        String fileName = "data.txt";
        AssetManager assetManager = getAssets();
        InputStream inputStream;
        try {
            inputStream = assetManager.open(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while (true) {
            try {
                if ((line = reader.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            displayLine.setText(line);
        }

        String[] assetsIWant;
        try {
            assetsIWant = assetManager.list("subdir");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        TextView displaySubdir = findViewById(R.id.display_subdir);
        displaySubdir.setText(Arrays.toString(assetsIWant));

        // đang tập dùng git
        // dùng git sướng vl



    }
}
