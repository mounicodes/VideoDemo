package com.mounica.videodemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {
  private static final String TAG = "MainActivity";
  private Button mLocalVideo;
  private Button mRemoteVideo;
  private Button mYouTube;
  private Uri mPath;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mLocalVideo = findViewById(R.id.playlocal);
    mRemoteVideo = findViewById(R.id.playremote);
    mYouTube = findViewById(R.id.playyoutube);
    mLocalVideo.setOnClickListener(this);
    mRemoteVideo.setOnClickListener(this);
    mYouTube.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch(v.getId()){
      case R.id.playlocal:
        mPath= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.yellowstone);
        break;
      case R.id.playremote:
        mPath = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
        break;
      case R.id.playyoutube:
        //TODO
        break;
    }
    Intent intent = new Intent(this,VideoPlayerActivity.class);
    intent.setData(mPath);
    startActivity(intent);
  }
}
