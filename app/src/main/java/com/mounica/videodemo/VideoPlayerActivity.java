package com.mounica.videodemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;
import android.widget.MediaController;

/**
 * Videoplayer activity
 */

public class VideoPlayerActivity extends AppCompatActivity {
  private VideoView mVideoPlay;
  private MediaController mMediaController;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.video_player);
    Intent intent = getIntent();

    mMediaController = new MediaController(this);
    mVideoPlay = findViewById(R.id.videoview);
    mMediaController.setAnchorView(mVideoPlay);
    mVideoPlay.setVideoURI(intent.getData());
    mVideoPlay.setMediaController(mMediaController);
    mVideoPlay.requestFocus();
    mVideoPlay.start();
  }
}
