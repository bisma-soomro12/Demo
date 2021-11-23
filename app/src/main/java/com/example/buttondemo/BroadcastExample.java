package com.example.buttondemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.KeyEvent;
import android.widget.Toast;

public class BroadcastExample extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

      // int percentage =intent.getIntExtra("level",0);
       if(intent.ACTION_BATTERY_LOW.equals(intent.getAction())){
           Toast.makeText(context.getApplicationContext(), "Battery is running low ",Toast.LENGTH_SHORT).show();
           String phn="03173341418";
           String message="battery is running LOW";
           SmsManager smsManager= SmsManager.getDefault();
           smsManager.sendTextMessage(phn,null,message,null,null);
       }
//        KeyEvent ke = (KeyEvent)intent.getExtras().get(Intent.EXTRA_KEY_EVENT);
//        int volume = (Integer)intent.getExtras().get("android.media.EXTRA_VOLUME_STREAM_VALUE");
//        if (ke .getKeyCode() == KeyEvent.KEYCODE_VOLUME_UP) {
//            Toast.makeText(context.getApplicationContext(), "volume up ",Toast.LENGTH_SHORT).show();
//        }else if (ke .getKeyCode() == KeyEvent.KEYCODE_VOLUME_DOWN) {
//            System.out.println("volume down");
//        }


    }
}
