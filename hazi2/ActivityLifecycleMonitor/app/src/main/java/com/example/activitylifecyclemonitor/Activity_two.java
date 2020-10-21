package com.example.activitylifecyclemonitor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_two extends AppCompatActivity{


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);
        }





        /** Called when the activity is about to become visible. */
        @Override
        protected void onStart() {
            super.onStart();
            Log.d("Statusz","Activity_two:onStart()");
        }

        /** Called when the activity has become visible. */
        @Override
        protected void onResume() {
            super.onResume();
            Log.d("Statusz","Activity_two:onStart()");
        }

        /** Called when another activity is taking focus. */
        @Override
        protected void onPause() {
            super.onPause();
            Log.d("Statusz","Activity_two:onStart()");
        }

        /** Called when the activity is no longer visible. */
        @Override
        protected void onStop() {
            super.onStop();
            Log.d("Statusz","Activity_two:onStart()");
        }

        /** Called just before the activity is destroyed. */
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d("Statusz","Activity_two:onStart()");
        }




}
