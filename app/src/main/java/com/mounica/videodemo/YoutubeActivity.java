package com.mounica.videodemo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Activity for YouTube
 */

public class YoutubeActivity extends YouTubeBaseActivity {
  private static final String TAG = "YoutubeActivity";

  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
  }

  @Override
  protected void onCreate(Bundle bundle) {
    super.onCreate(bundle);
    setContentView(R.layout.youtube_video_player);
    YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player);
    youTubePlayerView.initialize(getResources().getString(R.string.api_key),
        new YouTubePlayer.OnInitializedListener() {
          @Override
          public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer,
              boolean b) {
            youTubePlayer.loadVideo("ysa5OBhXz-Q");
          }

          @Override
          public void onInitializationFailure(Provider provider,
              YouTubeInitializationResult youTubeInitializationResult) {
            Log.i(TAG, "onInitializationFailure");
          }
        });
  }
}
