package com.ruander;

import com.ruander.alakzatok.FemAlakzat;
import com.ruander.alakzatok.Gomb;
import com.ruander.alakzatok.Hasab;

import java.util.ArrayList;

public class FemAlakzatokProgram {
    private ArrayList<FemAlakzat> alakzatok;

    public FemAlakzatokProgram() {
        alakzatok = new ArrayList<>();
        alakzatok.add(new Gomb(1));
        alakzatok.add(new Hasab(1,1,1));
    }

    public double gombokOsszSuly() {
        return 0.1;
    }

    public void ujAlakzat(FemAlakzat alakzat) {
        alakzatok.add(alakzat);
    }

    public ArrayList<FemAlakzat> getLista() {
        return alakzatok;
    }

    public double osszSuly() {
        double ossz= 0;
        for(FemAlakzat alakzat : alakzatok){
            ossz += alakzat.suly();
        }
        return ossz;
    }


    public FemAlakzat minV() {
        return new FemAlakzat() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }

    public FemAlakzat maxV() {
        return new FemAlakzat() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }
}
