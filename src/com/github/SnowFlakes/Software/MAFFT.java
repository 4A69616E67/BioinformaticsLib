package com.github.SnowFlakes.Software;

import com.github.SnowFlakes.File.CommonFile.CommonFile;
import com.github.SnowFlakes.System.CommandLineDhat;
import com.github.SnowFlakes.unit.Configure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by snowf on 2019/6/14.
 */

public class MAFFT extends AbstractSoftware {
    public MAFFT(String exe) {
        super(exe);
    }

    @Override
    protected void Init() {
        if (Execution.trim().equals("")) {
            System.err.println("[mafft]\tNo execute file");
        } else {
            if (Path.getName().equals("")) {
                getPath();
            }
            getVersion();
        }
    }

    @Override
    protected String getVersion() {
        CommonFile temporaryFile = new CommonFile(Configure.OutPath + "/mafft.version.tmp");
        try {
            CommandLineDhat.run(Execution + " --version", null, new PrintWriter(temporaryFile));
            ArrayList<char[]> tempLines = temporaryFile.Read();
            Version = String.valueOf(tempLines.get(0));
        } catch (IOException | InterruptedException e) {
            Valid = false;
        }
        temporaryFile.delete();
        return Version;
    }
}
