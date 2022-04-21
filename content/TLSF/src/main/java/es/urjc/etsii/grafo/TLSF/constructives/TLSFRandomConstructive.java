package es.urjc.etsii.grafo.TLSF.constructives;

import es.urjc.etsii.grafo.TLSF.model.TLSFInstance;
import es.urjc.etsii.grafo.TLSF.model.TLSFSolution;
import es.urjc.etsii.grafo.solver.create.Constructive;

public class TLSFRandomConstructive extends Constructive<TLSFSolution, TLSFInstance> {

    @Override
    public TLSFSolution construct(TLSFSolution solution) {
        // IN --> Empty solution from solution(instance) constructor
        // OUT --> Feasible solution with an assigned score
        // TODO: Implement random constructive


        // Remember to call solution.updateLastModifiedTime() if the solution is modified without using moves!!
        solution.updateLastModifiedTime();
        //return solution;
        throw new UnsupportedOperationException("RandomConstructive not implemented yet");
    }
}
