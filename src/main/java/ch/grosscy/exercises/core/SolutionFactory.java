package ch.grosscy.exercises.core;

import ch.grosscy.exercises.challenge01.Challenge01;
import ch.grosscy.exercises.challenge01.Solution01;
import ch.grosscy.exercises.challenge02.Challenge02;
import ch.grosscy.exercises.challenge02.Solution02;
import ch.grosscy.exercises.challenge03.Challenge03;
import ch.grosscy.exercises.challenge03.Solution03;
import ch.grosscy.exercises.challenge04.Challenge04;
import ch.grosscy.exercises.challenge04.Solution04;
import ch.grosscy.exercises.challenge05.Challenge05;
import ch.grosscy.exercises.challenge05.Solution05;
import ch.grosscy.exercises.challenge06.Challenge06;
import ch.grosscy.exercises.challenge06.Solution06;
import ch.grosscy.exercises.challenge07.Challenge07;
import ch.grosscy.exercises.challenge07.Solution07;
import ch.grosscy.exercises.challenge08.Challenge08;
import ch.grosscy.exercises.challenge08.Solution08;
import ch.grosscy.exercises.challenge09.Challenge09;
import ch.grosscy.exercises.challenge09.Solution09;
import ch.grosscy.exercises.challenge10.Challenge10;
import ch.grosscy.exercises.challenge10.Solution10;
import ch.grosscy.exercises.challenge11.Challenge11;
import ch.grosscy.exercises.challenge11.Solution11;
import ch.grosscy.exercises.challenge12.Challenge12;
import ch.grosscy.exercises.challenge12.Solution12;
import ch.grosscy.exercises.challenge13.Challenge13;
import ch.grosscy.exercises.challenge13.Solution13;
import ch.grosscy.exercises.challenge14.Challenge14;
import ch.grosscy.exercises.challenge14.Solution14;
import ch.grosscy.exercises.challenge15.Challenge15;
import ch.grosscy.exercises.challenge15.Solution15;
import ch.grosscy.exercises.challenge16.Challenge16;
import ch.grosscy.exercises.challenge16.Solution16;

import java.util.HashMap;
import java.util.Map;

public class SolutionFactory {

    private static final Map<Class<? extends Challenge>, Challenge> solutionMap;

    static {
        solutionMap = new HashMap<>();
        solutionMap.put(Challenge01.class, new Solution01());
        solutionMap.put(Challenge02.class, new Solution02());
        solutionMap.put(Challenge03.class, new Solution03());
        solutionMap.put(Challenge04.class, new Solution04());
        solutionMap.put(Challenge05.class, new Solution05());
        solutionMap.put(Challenge06.class, new Solution06());
        solutionMap.put(Challenge07.class, new Solution07());
        solutionMap.put(Challenge08.class, new Solution08());
        solutionMap.put(Challenge09.class, new Solution09());
        solutionMap.put(Challenge10.class, new Solution10());
        solutionMap.put(Challenge11.class, new Solution11());
        solutionMap.put(Challenge12.class, new Solution12());
        solutionMap.put(Challenge13.class, new Solution13());
        solutionMap.put(Challenge14.class, new Solution14());
        solutionMap.put(Challenge15.class, new Solution15());
        solutionMap.put(Challenge16.class, new Solution16());
    }

    public static Challenge getSolution(Class<? extends Challenge> challengeClass) {
        if (!solutionMap.containsKey(challengeClass)) {
            throw new UnsupportedOperationException("No solution found for " + challengeClass);
        }

        return solutionMap.get(challengeClass);
    }

}
