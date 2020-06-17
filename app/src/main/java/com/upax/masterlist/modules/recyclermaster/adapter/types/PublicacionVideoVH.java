package com.upax.masterlist.modules.recyclermaster.adapter.types;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.util.Util;
import com.upax.masterlist.BuildConfig;
import com.upax.masterlist.R;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionImagen;
import com.upax.masterlist.modules.recyclermaster.entities.amodelos.PublicacionVideo;

public class PublicacionVideoVH extends BaseVHTimeLine<PublicacionImagen> {

    private SimpleExoPlayer mPlayer;
    private PlayerView mPlayerView;
    private PublicacionVideo mItemVideo;
    private TextView tvDuracion;


    public PublicacionVideoVH(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void castItem() {
        mItemVideo = (PublicacionVideo) mItem;
    }

    @Override
    public void start() {
        Log.d("TAG", "start: ");
        mPlayerView = view.findViewById(R.id.video);
        tvDuracion = view.findViewById(R.id.tv_duracion);

        tvDuracion.setText(String.valueOf(mItemVideo.getDuration()));

        mPlayer = new SimpleExoPlayer.Builder(getContext())
            .build();

        DataSource.Factory dataSourceFactory = new DefaultDataSourceFactory(getContext(),
            Util.getUserAgent(getContext(), BuildConfig.APPLICATION_ID));

        String path = "android.resource://" + getContext().getPackageName() + "/" + mItemVideo.resource;

        String videoPath = RawResourceDataSource.buildRawResourceUri(R.raw.prueba).toString();
        Uri uri = RawResourceDataSource.buildRawResourceUri(R.raw.prueba);

        ExtractorMediaSource audioSource = new ExtractorMediaSource(
                uri,
                new DefaultDataSourceFactory(getContext(), "MyExoplayer"),
                new DefaultExtractorsFactory(),
                null,
                null
        );

        MediaSource videoSource =
                new ProgressiveMediaSource.Factory(dataSourceFactory)
                        .createMediaSource(Uri.parse(path));

        mPlayer.prepare(audioSource);
        mPlayerView.setPlayer(mPlayer);

        mPlayerView.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_ZOOM);
    }

    @Override
    public void onViewRecycled() {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
            mPlayer = null;
        }
    }
}
