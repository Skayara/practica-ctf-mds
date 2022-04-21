package es.urjc.etsii.grafo.TLSF.model;

import es.urjc.etsii.grafo.solver.services.SolutionValidator;
import es.urjc.etsii.grafo.solver.services.ValidationResult;

/**
 * Validate that a solution is valid for the TLSF problem.
 * Validation is always run after the algorithms executes, and can be run in certain algorithm stages to verify
 * that the current solution is valid.
 */
public class TLSFSolutionValidator extends SolutionValidator<TLSFSolution, TLSFInstance> {

    /**
     * Validate the current solution, check that no constraint is broken and everything is fine
     *
     * @param solution Solution to validate
     * @return ValidationResult.ok() if the solution is valid, ValidationResult.fail("reason why it failed") if a solution is not valid.
     */
    @Override
    public ValidationResult validate(TLSFSolution solution) {
        // Example check:

//        if(solution.getAssignedElements() > 10){
//            return ValidationResult.fail("Cannot have more than 10 assigned elements");
//        }

        return ValidationResult.ok();
    }
}
