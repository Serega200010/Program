package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView SYSinfo = (TextView) findViewById(R.id.SYSinfo);
        SYSinfo.setText(ReadSYSinfo());
    }


private static StringBuffer SYSinfoBuffer;

    private String ReadSYSinfo(){
    SYSinfoBuffer=new StringBuffer();

        getProperty("OS", "os.name", SYSinfoBuffer);
        getProperty("Version", "os.version", SYSinfoBuffer);

        getProperty("URL vendor", "java.vendor.url", SYSinfoBuffer);
        getProperty("JAVA version", "java.version", SYSinfoBuffer);

        return SYSinfoBuffer.toString();

    }

private void getProperty(String desc,String property, StringBuffer tBuffer){

    tBuffer.append(desc);
    tBuffer.append(" : ");
    tBuffer.append(System.getProperty(property));
    tBuffer.append("\n");



}
}