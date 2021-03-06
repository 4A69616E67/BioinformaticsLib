package com.github.SnowFlakes.Software;

import com.github.SnowFlakes.File.CommonFile.CommonFile;
import com.github.SnowFlakes.System.CommandLineDhat;
import com.github.SnowFlakes.unit.Configure;
import com.github.SnowFlakes.unit.Opts;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by snowf on 2019/3/10.
 */

public abstract class AbstractSoftware {
    protected File Path = new File("");
    protected String Version = "";
    protected String Execution;
    protected boolean Valid = false;

    AbstractSoftware(String exe) {
        Execution = exe;
        if (new File(exe).isFile()) {
            Path = new File(new File(exe).getParent());
        }
        Init();
    }

    protected abstract void Init();

    protected abstract String getVersion();

    protected File getPath() {
        if (!Configure.OutPath.isDirectory()) {
            System.err.println("Please create out path first: " + Configure.OutPath);
            System.exit(1);
        }
        CommonFile temporaryFile = new CommonFile(Configure.OutPath + "/software.path.tmp");
        try {
            String ComLine;
            if (Opts.OsName.matches(".*(?i)windows.*")) {
                ComLine = "where " + Execution;
            } else {
                ComLine = "which " + Execution;
            }
//            Opts.CommandOutFile.Append(ComLine + "\n");
            CommandLineDhat.run(ComLine, new PrintWriter(temporaryFile), null);
            ArrayList<char[]> tempLines = temporaryFile.Read();
            Path = new File(String.valueOf(tempLines.get(0))).getParentFile();
            Execution = Path + "/" + Execution;
            Valid = true;
            temporaryFile.delete();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error! can't locate " + Execution + " full path");
            System.exit(1);
        }
        return Path;
    }

    public String version() {
        return Version != null ? Version : getVersion();
    }

    public boolean isValid() {
        return Valid;
    }

    @Override
    public String toString() {
        return Execution + "\tVersion: " + Version;
    }

    public String Exe() {
        return Execution;
    }
}
