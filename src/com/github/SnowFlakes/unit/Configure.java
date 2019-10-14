package com.github.SnowFlakes.unit;


import com.github.SnowFlakes.File.FastQFile.FastqFile;
import com.github.SnowFlakes.FragmentDigested.RestrictionEnzyme;
import com.github.SnowFlakes.Sequence.DNASequence;
import com.github.SnowFlakes.Software.Bwa;
import com.github.SnowFlakes.Software.MAFFT;
import com.github.SnowFlakes.Software.Python;
import com.github.SnowFlakes.tool.LinkerDetection;
import com.github.SnowFlakes.tool.Tools;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by snowf on 2019/2/17.
 */
public class Configure {

//    public static File InterActionDistanceDisPng;
//    public static File LinkerScoreDisPng;
//    //-----------------------------------------------------------
//    public static FastqFile InputFile;
//    public static RestrictionEnzyme Restriction;
//    public static String[] HalfLinker;
//    public static File GenomeFile;
    //-----------------------------------------------------------
    public static File OutPath = new File("./");
    public static String Prefix = "out";
//    public static File Index;
//    public static File EnzymeFragmentPath = new File(OutPath + "/" + Opts.OutDir.EnzyFragDir);
//    public static Chromosome[] Chromosome;
//    public static String[] AdapterSeq;
//    public static int[] Resolution = new int[]{1000000};
//    public static int[] DrawResolution = new int[]{1000000};
    //    public static int DetectResolution = 100000;
    public static int Thread = 8;
//    public static String Step = "-";
    //-----------------------------------------------------------------
    public static com.github.SnowFlakes.Software.Python Python;
    public static com.github.SnowFlakes.Software.Bwa Bwa;//
    public static MAFFT Mafft;
    public static String Bowtie = "";//bowtie
    public static int MatchScore = 1;
//    public static int MisMatchScore = -1;
//    public static int InDelScore = -1;
//    public static int MinLinkerLen;
//    public static int MinReadsLen = 16;
//    public static int MaxReadsLen = 20;
//    public static int AlignThread = 1;
//    public static String AlignType = "Short";
//    public static int AlignMisMatch = 0;
//    public static int MinUniqueScore;
//    public static boolean Iteration = false;
    public static int DeBugLevel = 0;

//    public enum Require {
//        InputFile("InputFile", Configure.InputFile), Restriction("Restriction", Configure.Restriction), HalfLinker("HalfLinker", Configure.HalfLinker != null ? Tools.ArraysToString(Configure.HalfLinker) : null), GenomeFile("GenomeFile", Configure.GenomeFile);
//        private String Key;
//        public Object Value;
//
//        Require(String s, Object v) {
//            this.Key = s;
//            this.Value = v;
//        }
//
//        public String getKey() {
//            return Key;
//        }
//
//        @Override
//        public String toString() {
//            return Key + " = " + (Value == null ? "" : Value.toString());
//        }
//    }
//
//    public enum Optional {
//        OutPath("OutPath", Configure.OutPath), Prefix("Prefix", Configure.Prefix), Index("Index", Configure.Index), EnzymeFragmentPath("EnzymeFragmentPath", Configure.EnzymeFragmentPath), Chromosomes("Chromosomes", Tools.ArraysToString(Configure.Chromosome)), AdapterSeq("AdapterSeq", Tools.ArraysToString(Configure.AdapterSeq)), Resolutions("Resolutions", Tools.ArraysToString(Configure.Resolution)), DrawResolutions("DrawResolutions", Tools.ArraysToString(Configure.DrawResolution)), Thread("Thread", Configure.Thread), Step("Step", Configure.Step);
//        private String Key;
//        public Object Value;
//
//        Optional(String s, Object v) {
//            this.Key = s;
//            this.Value = v;
//        }
//
//        public String getKey() {
//            return Key;
//        }
//
//        @Override
//        public String toString() {
//            return Key + " = " + (Value == null ? "" : Value.toString());
//        }
//    }
//
//    public enum Advance {
//        Python("Python", Configure.Python), BWA("Bwa", Configure.Bwa), MAFFT("Mafft", Configure.Mafft), Bowtie("Bowtie", Configure.Bowtie), MatchScore("MatchScore", Configure.MatchScore), MisMatchScore("MisMatchScore", Configure.MisMatchScore), InDelScore("InDelScore", Configure.InDelScore), MinLinkerLen("MinLinkerLen", Configure.MinLinkerLen), MinReadsLength("MinReadsLength", Configure.MinReadsLen), MaxReadsLength("MaxReadsLength", Configure.MaxReadsLen), AlignThread("AlignThread", Configure.AlignThread), AlignType("AlignType", Configure.AlignType), AlignMisMatch("AlignMisMatch", Configure.AlignMisMatch), MinUniqueScore("MinUniqueScore", Configure.MinUniqueScore), Iteration("Iteration", Configure.Iteration), DeBugLevel("DeBugLevel", Configure.DeBugLevel);
//        private String Key;
//        public Object Value;
//
//        Advance(String s, Object v) {
//            this.Key = s;
//            this.Value = v;
//        }
//
//        public String getKey() {
//            return Key;
//        }
//
//        @Override
//        public String toString() {
//            return Key + " = " + (Value == null ? "" : Value.toString());
//        }
//    }

//    public static void GetOption(File ConfFile, File AdvConfFile) throws IOException {
//        Properties Config = new Properties();
//        if (AdvConfFile != null && AdvConfFile.isFile()) {
//            Config.load(new FileReader(AdvConfFile));
//        }
//        Config.load(new FileReader(ConfFile));
//        for (Require r : Require.values()) {
//            if (Config.getProperty(r.getKey()) != null && !Config.getProperty(r.getKey()).trim().equals(""))
//                r.Value = Config.getProperty(r.getKey()).trim();
//        }
//        for (Optional o : Optional.values()) {
//            if (Config.getProperty(o.getKey()) != null && !Config.getProperty(o.getKey()).trim().equals(""))
//                o.Value = Config.getProperty(o.getKey()).trim();
//        }
//        for (Advance a : Advance.values()) {
//            if (Config.getProperty(a.getKey()) != null && !Config.getProperty(a.getKey()).trim().equals(""))
//                a.Value = Config.getProperty(a.getKey()).trim();
//        }
////        Init();
//    }

    public static boolean DependenceCheck() {
        boolean Satisfied = true;
        return Satisfied;
    }

//    public static void Update() {
//        Require.InputFile.Value = InputFile;
//        Require.HalfLinker.Value = Tools.ArraysToString(HalfLinker);
//        Require.Restriction.Value = Restriction;
//        Require.GenomeFile.Value = GenomeFile;
//        //-------------------------------------------
//        Optional.OutPath.Value = OutPath;
//        Optional.Prefix.Value = Prefix;
//        Optional.Index.Value = Index;
//        Optional.EnzymeFragmentPath.Value = EnzymeFragmentPath;
//        Optional.Chromosomes.Value = Tools.ArraysToString(Chromosome);
//        Optional.AdapterSeq.Value = Tools.ArraysToString(AdapterSeq);
//        Optional.Resolutions.Value = Tools.ArraysToString(Resolution);
//        Optional.DrawResolutions.Value = Tools.ArraysToString(DrawResolution);
////        Optional.DetectResolution.Value = DetectResolution;
//        Optional.Thread.Value = Thread;
//        Optional.Step.Value = Step;
//        //----------------------------------------------
//        Advance.Python.Value = Python;
//        Advance.BWA.Value = Bwa;
//        Advance.MAFFT.Value = Mafft;
//        Advance.MatchScore.Value = MatchScore;
//        Advance.MisMatchScore.Value = MisMatchScore;
//        Advance.MinLinkerLen.Value = MinLinkerLen;
//        Advance.MinReadsLength.Value = MinReadsLen;
//        Advance.MaxReadsLength.Value = MaxReadsLen;
//        Advance.InDelScore.Value = InDelScore;
//        Advance.AlignThread.Value = AlignThread;
//        Advance.AlignType.Value = AlignType;
//        Advance.AlignMisMatch.Value = AlignMisMatch;
//        Advance.MinUniqueScore.Value = MinUniqueScore;
//        Advance.Iteration.Value = Iteration;
//        Advance.DeBugLevel.Value = DeBugLevel;
//    }

//    public static void Init() throws IOException {
//        InputFile = Require.InputFile.Value != null ? new FastqFile(Require.InputFile.Value.toString().trim()) : null;
//        Restriction = Require.Restriction.Value != null ? new RestrictionEnzyme(Require.Restriction.Value.toString().trim()) : null;
//        HalfLinker = Require.HalfLinker.Value != null ? Require.HalfLinker.Value.toString().trim().split("\\s+") : null;
//        if (HalfLinker == null) {
//            ArrayList<DNASequence> linkers = LinkerDetection.run(InputFile, new File(""), 0, 70, 5000, Restriction, 10, 0.05f);
//            HalfLinker = new String[linkers.size()];
//            for (int i = 0; i < HalfLinker.length; i++) {
//                HalfLinker[i] = linkers.get(i).getSeq().substring(0, linkers.get(i).getSeq().length() / 2);
//            }
//            Require.HalfLinker.Value = String.join(" ", HalfLinker);
//        }
//        if (Restriction == null) {
//            Restriction = LinkerDetection.Enzyme;
//            Require.Restriction.Value = Restriction.toString();
//        }
//        GenomeFile = Require.GenomeFile.Value != null ? new File(Require.GenomeFile.Value.toString()) : null;
//        //----------------------------------------------------------------------------------------------------
//        OutPath = Optional.OutPath.Value != null ? new File(Optional.OutPath.Value.toString().trim()) : OutPath;
//        Prefix = Optional.Prefix.Value != null ? Optional.Prefix.Value.toString().trim() : Prefix;
//        Index = Optional.Index.Value != null ? new File(Optional.Index.Value.toString().trim()) : Index;
//        EnzymeFragmentPath = Optional.EnzymeFragmentPath.Value != null ? new File(Optional.EnzymeFragmentPath.Value.toString().trim()) : EnzymeFragmentPath;
//        if (Optional.Chromosomes.Value != null && !Optional.Chromosomes.Value.toString().trim().equals("")) {
//            String[] str = Optional.Chromosomes.Value.toString().trim().split("\\s+");
//            Chromosome = new Chromosome[str.length];
//            for (int i = 0; i < Chromosome.length; i++) {
//                Chromosome[i] = new Chromosome(str[i]);
//            }
//        }
//        AdapterSeq = Optional.AdapterSeq.Value != null ? Optional.AdapterSeq.Value.toString().trim().split("\\s+") : AdapterSeq;
//        Resolution = GetIntArray(Optional.Resolutions.Value, Resolution);
//        DrawResolution = GetIntArray(Optional.DrawResolutions.Value, DrawResolution);
////        DetectResolution = GetIntItem(Optional.DetectResolution.Value, DetectResolution);
//        Thread = GetIntItem(Optional.Thread.Value, Thread);
//        Step = Optional.Step.Value != null ? Optional.Step.Value.toString() : Step;
//        //----------------------------------------------------------------------------------------------------
//        MatchScore = GetIntItem(Advance.MatchScore.Value, MatchScore);
//        MisMatchScore = GetIntItem(Advance.MisMatchScore.Value, MisMatchScore);
//        InDelScore = GetIntItem(Advance.InDelScore.Value, InDelScore);
//        MinLinkerLen = GetIntItem(Advance.MinLinkerLen.Value, MinLinkerLen);
//        MinReadsLen = GetIntItem(Advance.MinReadsLength.Value, MinReadsLen);
//        MaxReadsLen = GetIntItem(Advance.MaxReadsLength.Value, MaxReadsLen);
//        AlignThread = GetIntItem(Advance.AlignThread.Value, AlignThread);
//        AlignType = Advance.AlignType.Value != null ? Advance.AlignType.Value.toString().trim() : AlignType;
//        AlignMisMatch = GetIntItem(Advance.AlignMisMatch.Value, AlignMisMatch);
//        MinUniqueScore = GetIntItem(Advance.MinUniqueScore.Value, MinUniqueScore);
//        Bwa = new Bwa(Advance.BWA.Value.toString());
//        Bowtie = Advance.Bowtie.Value.toString();
//        Python = new Python(Advance.Python.Value.toString());
//        Mafft = new MAFFT(Advance.MAFFT.Value.toString());
//        Iteration = Boolean.valueOf(Advance.Iteration.Value.toString());
//        DeBugLevel = Integer.parseInt(Advance.DeBugLevel.Value.toString());
//    }

    public static int GetIntItem(Object o, int d) {
        if (o != null) {
            try {
                int i = Integer.parseInt(o.toString().trim());
                if (i == 0) {
                    return d;
                } else {
                    return i;
                }
            } catch (NumberFormatException e) {
                return d;
            }
        }
        return d;
    }

    public static int[] GetIntArray(Object o, int[] d) {
        if (o != null) {
            try {
                int[] i = StringArrays.toInteger(o.toString().trim().split("\\s+"));
                if (i.length == 0) {
                    return d;
                } else {
                    return i;
                }
            } catch (NumberFormatException e) {
                return d;
            }
        }
        return d;
    }
}

