package kr.co.hoon.a180604broadcastreceive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = intent.getAction() + "가(이) 수신됨!";
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();

        // MainActivity 실행
        Intent myintent = new Intent(context, MainActivity.class);
        myintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(myintent);
    }
}
