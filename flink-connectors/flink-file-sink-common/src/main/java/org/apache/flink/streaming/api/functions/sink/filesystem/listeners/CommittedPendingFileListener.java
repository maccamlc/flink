package org.apache.flink.streaming.api.functions.sink.filesystem.listeners;

import org.apache.flink.annotation.PublicEvolving;

/**
 * A listener that can be used to know when a pending file has been committed
 */
@PublicEvolving
public interface CommittedPendingFileListener {

    /**
     * Callback that will be invoked when the pending file has been committed
     *
     * @param commitName The name of the file
     */
    void onCommitted(String commitName);

}
