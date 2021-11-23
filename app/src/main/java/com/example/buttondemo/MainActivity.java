package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.usage.UsageEvents;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    int counter1=0;
    BroadcastExample brd= new BroadcastExample();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String phn = "111";
        String message = "need help for emergency";

//        try {
//            Toast.makeText(this, "POWER OFF BUTTON CLICKED", Toast.LENGTH_SHORT).show();
//            SmsManager smsManager = SmsManager.getDefault();
//            smsManager.sendTextMessage(phn, null, message, null, null);
//
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(),
//                    "SMS faild, please try again later!",
//                    Toast.LENGTH_LONG).show();
//
//        }
    }

   // @Override
//    public void onBackPressed() {
//        String phn="111";
//        String message="need help for emergency";
//        Toast.makeText(this, "POWER OFF BUTTON CLICKED", Toast.LENGTH_SHORT).show();
//        SmsManager smsManager= SmsManager.getDefault();
//        smsManager.sendTextMessage(phn,null,message,null,null);
//        counter++;
//        if(counter==2){
//
//            super.onBackPressed();
//        }
//
//    }

//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//
//        //counter1++;
//
//
//            if(event.getKeyCode()==KeyEvent.KEYCODE_VOLUME_DOWN){
//
//
//        }
//        return super.dispatchKeyEvent(event);
//    }

    @Override
    protected void onStart() {
        this.registerReceiver(brd,new IntentFilter(Intent.ACTION_BATTERY_LOW));
       // IntentFilter filter = new IntentFilter();
      //  filter.addAction("android.media.VOLUME_CHANGED_ACTION");
        super.onStart();
    }

    @Override
    protected void onStop() {
        //unregisterReceiver(brd);
        super.onStop();
    }
}