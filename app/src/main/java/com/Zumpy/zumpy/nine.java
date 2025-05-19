package com.Zumpy.zumpy;

import androidx.annotation.OptIn;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.ui.PlayerView;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import com.RMD.zumpy.R;


public class nine extends AppCompatActivity {

    private ExoPlayer player;
    private PlayerView playerView;
    private final String videoUrl = "https://aaditya-red-mountain.s3.ap-south-1.amazonaws.com/yog_9.mp4";

    @OptIn(markerClass = UnstableApi.class)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

        // Initialize PlayerView
        playerView = findViewById(R.id.playerView);

        // Initialize ExoPlayer
        player = new ExoPlayer.Builder(this)
                .setSeekForwardIncrementMs(10000) // Set 10-second forward increment
                .setSeekBackIncrementMs(10000)    // Set 10-second backward increment
                .build();
        playerView.setPlayer(player);

        // Prepare the media item
        Uri uri = Uri.parse(videoUrl);
        MediaItem mediaItem = MediaItem.fromUri(uri);
        player.setMediaItem(mediaItem);

        // Prepare and start playback
        player.prepare();
        player.play();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release the player when the activity is destroyed
        if (player != null) {
            player.release();
            player = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Pause playback when the activity is paused
        if (player != null) {
            player.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Resume playback when the activity is resumed
        if (player != null) {
            player.play();
        }
    }
}