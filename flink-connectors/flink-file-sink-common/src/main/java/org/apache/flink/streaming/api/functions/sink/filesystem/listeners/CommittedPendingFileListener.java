package org.apache.flink.streaming.api.functions.sink.filesystem.listeners;

public interface CommittedPendingFileListener {

    void onCommitted(String commitName);

}
