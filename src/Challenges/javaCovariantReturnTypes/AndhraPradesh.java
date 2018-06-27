package Challenges.javaCovariantReturnTypes;

public class AndhraPradesh extends Region{

    @Override
    Flower yourNationalFlower() {
        return new Lily();
    }
}
