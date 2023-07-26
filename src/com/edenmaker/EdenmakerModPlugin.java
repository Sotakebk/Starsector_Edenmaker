package com.edenmaker;

import com.fs.starfarer.api.BaseModPlugin;
import com.thoughtworks.xstream.XStream;

public class EdenmakerModPlugin extends BaseModPlugin {

    @Override
    public void onGameLoad(boolean newGame) {
        super.onGameLoad(newGame);

    }

    /**
     * Tell the XML serializer to use custom naming, so that moving or renaming classes doesn't break saves.
     */
    @Override
    public void configureXStream(XStream x) {
        super.configureXStream(x);
    }
}