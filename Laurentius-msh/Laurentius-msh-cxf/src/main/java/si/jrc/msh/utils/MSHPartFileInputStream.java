package si.jrc.msh.utils;


import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class MSHPartFileInputStream extends FilterInputStream {
    private FileChannel myFileChannel;
    private long mark = -1;

    public MSHPartFileInputStream(FileInputStream fis) {
        super(fis);
        myFileChannel = fis.getChannel();
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public synchronized void mark(int readlimit) {
        try {
            mark = myFileChannel.position();
        } catch (IOException ex) {
            mark = -1;
        }
    }

    @Override
    public synchronized void reset() throws IOException {
        if (mark == -1) {
            throw new IOException("not marked");
        }
        myFileChannel.position(mark);
    }
}