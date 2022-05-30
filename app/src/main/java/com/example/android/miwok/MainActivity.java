/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersView = findViewById(R.id.numbers);
        TextView colorView = findViewById(R.id.colors);
        TextView familyView = findViewById(R.id.family);
        TextView phrasesView = findViewById(R.id.phrases);

        numbersView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(intent);
        });
        colorView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(intent);
        });
        familyView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(intent);
        });
        phrasesView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(intent);
        });
    }
}
