package Challenges.javaCovariantReturnTypes;

public class WestBengal extends Region{
    @Override
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}
