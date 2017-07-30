package com.rorlig.glidesampleapplication;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.GlideModule;

/**
 * @author gaurav gupta
 */

public class GlideConfiguration implements GlideModule {

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        // Apply options to the builder here.
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
    }


    /**
     * Lazily register components immediately after the Glide singleton is created but before any
     * requests can be started.
     * <p>
     * <p> This method will be called once and only once per implementation. </p>
     *
     * @param context  An Application {@link Context}.
     * @param registry An {@link Registry} to use to register components.
     */
    @Override
    public void registerComponents(Context context, Registry registry) {

    }
}