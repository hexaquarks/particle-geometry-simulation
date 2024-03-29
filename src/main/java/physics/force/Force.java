package physics.force;

import physics.particle.Particle;

public interface Force {
    double[] calculateForce(Particle p1, Particle p2);
    void applyForce(Particle p, double[] force);
}