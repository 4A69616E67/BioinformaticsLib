package com.github.SnowFlakes.Sequence;

import java.util.ArrayList;

/**
 * Created by snowf on 2019/4/23.
 */

public class KmerStructure {
    public DNASequence Seq;
    public ArrayList<KmerStructure> next = new ArrayList<>();
    public ArrayList<KmerStructure> last = new ArrayList<>();
    public boolean Visited = false;

    public KmerStructure(DNASequence seq) {
        Seq = seq;
    }
}
