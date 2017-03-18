package com.example.hp_pc.snakeandladder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import java.Box;
import java.util.Random;


public class levels extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    ImageButton dice;
    int numb;
    Random num;
    Box boxes;
    int player=0;
    private GoogleApiClient client;
ImageView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

       boxes= new Box[100];
        boxes[0]= new Box(-440,-460);
        boxes[1]= new Box(-350,-460);
        boxes[2]= new Box(-265, -460);
        boxes[3]= new Box(-190, -460);
        boxes[4]= new Box(-100, -460);
        boxes[5]= new Box(-50, -460);
        boxes[6]= new Box(50,-460);
        boxes[7]= new Box(140, -460);
        boxes[8]= new Box(230,-460);
        boxes[9]= new Box(300,-460);
        boxes[19]= new Box(52,-550);
        boxes[18]= new Box(187,-550);
        boxes[17]= new Box(320,-550);
        boxes[16]= new Box(450,-550);
        boxes[15]= new Box(580,-550);
        boxes[14]= new Box(710,-550);
        boxes[13]= new Box(840,-550);
        boxes[12]= new Box(970,-550);
        boxes[11]= new Box(1100,-550);
        boxes[10]= new Box(1230,-550);
        boxes[20]= new Box(52,-630);
        boxes[21]= new Box(187,-630);
        boxes[22]= new Box(320,-630);
        boxes[23]= new Box(450,-630);
        boxes[24]= new Box(580,-630);
        boxes[25]= new Box(710,-630);
        boxes[26]= new Box(840,-630);
        boxes[27]= new Box(970,-630);
        boxes[28]= new Box(1100,-630);
        boxes[29]= new Box(1230,-630);
        boxes[39]= new Box(52,-700);
        boxes[38]= new Box(187,-700);
        boxes[37]= new Box(320,-700);
        boxes[36]= new Box(450,-700);
        boxes[35]= new Box(580,-700);
        boxes[34]= new Box(710,-700);
        boxes[33]= new Box(840,-700);
        boxes[32]= new Box(970,-700);
        boxes[31]= new Box(1100,-700);
        boxes[30]= new Box(1230,-700);
        boxes[40]= new Box(52,-780);
        boxes[41]= new Box(187,-780);
        boxes[42]= new Box(320,-780);
        boxes[43]= new Box(450,-780);
        boxes[44]= new Box(580,-780);
        boxes[45]= new Box(710,-780);
        boxes[46]= new Box(840,-780);
        boxes[47]= new Box(970,-780);
        boxes[48]= new Box(1100,-780);
        boxes[49]= new Box(1230,-780);
        boxes[59]= new Box(52,-870);
        boxes[58]= new Box(187,-870);
        boxes[57]= new Box(320,-870);
        boxes[56]= new Box(450,-870);
        boxes[55]= new Box(580,-870);
        boxes[54]= new Box(710,-870);
        boxes[53]= new Box(840,-870);
        boxes[52]= new Box(970,-870);
        boxes[51]= new Box(1100,-870);
        boxes[50]= new Box(1230,-870);
        boxes[60]= new Box(52,-950);
        boxes[61]= new Box(187,-950);
        boxes[62]= new Box(320,-950);
        boxes[63]= new Box(450,-950);
        boxes[64]= new Box(580,-950);
        boxes[65]= new Box(710,-950);
        boxes[66]= new Box(840,-950);
        boxes[67]= new Box(970,-950);
        boxes[68]= new Box(1100,-950);
        boxes[69]= new Box(1230,-950);
        boxes[79]= new Box(52,-1030);
        boxes[78]= new Box(187,-1030);
        boxes[77]= new Box(320,-1030);
        boxes[76]= new Box(450,-1030);
        boxes[75]= new Box(580,-1030);
        boxes[74]= new Box(710,-1030);
        boxes[73]= new Box(840,-1030);
        boxes[72]= new Box(970,-1030);
        boxes[71]= new Box(1100,-1030);
        boxes[70]= new Box(1230,-1030);
        boxes[80]= new Box(52,-1120);
        boxes[81]= new Box(187,-1120);
        boxes[82]= new Box(320,-1120);
        boxes[83]= new Box(450,-1120);
        boxes[84]= new Box(580,-1120);
        boxes[85]= new Box(710,-1120);
        boxes[86]= new Box(840,-1120);
        boxes[87]= new Box(970,-1120);
        boxes[88]= new Box(1100,-1120);
        boxes[89]= new Box(1230,-1120);
        boxes[99]= new Box(52,-1200);
        boxes[98]= new Box(187,-1200);
        boxes[97]= new Box(320,-1200);
        boxes[96]= new Box(450,-1200);
        boxes[95]= new Box(580,-1200);
        boxes[94]= new Box(710,-1200);
        boxes[93]= new Box(840,-1200);
        boxes[92]= new Box(970,-1200);
        boxes[91]= new Box(1100,-1200);
        boxes[90]= new Box(1230,-1200);
        final int[][] positions;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        dice =(ImageButton)findViewById(R.id.imgbutt);
        s= (ImageView)findViewById(R.id.imageView2);
        positions=new int[100][2];
        s.setX(-350);
        s.setY(-550);

        num=new Random();
        dice.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v){
            numb=num.nextInt(6)+1;
            if(numb==1)
            {
                dice.setImageResource(R.drawable.one);
            }
            else if(numb==2)
            {
                dice.setImageResource(R.drawable.two);
            }
            else if(numb==3)
            {
                dice.setImageResource(R.drawable.three);
            }
            else if(numb==4)
            {
                dice.setImageResource(R.drawable.four);
            }
            else if(numb==5)
            {
                dice.setImageResource(R.drawable.five);
            }
            else if(numb==6)
            {
                dice.setImageResource(R.drawable.six);
            }
        }}));
                client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }



    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "levels Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.hp_pc.snakeandladder/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "levels Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.hp_pc.snakeandladder/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

