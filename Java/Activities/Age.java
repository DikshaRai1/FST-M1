public class Age {
    double age;
    public double ageOnEarth(long seconds){
        this.age=seconds/31557600;
        return age;
    }
    public double ageOnMercury(long seconds){
        this.age=seconds/(31557600*0.2408467);
        return age;
    }
    public double ageOnVenus(long seconds){
        this.age=seconds/(31557600*0.61519726);
        return age;
    }
    public double ageOnMars(long seconds){
        this.age=seconds/(31557600*1.8808158);
        return age;
    }
    public double ageOnJupiter(long seconds){
        this.age=seconds/(31557600*11.862615);
        return age;
    }
    public double ageOnSaturn(long seconds){
        this.age=seconds/(31557600*29.447498);
        return age;
    }
    public double ageOnUranus(long seconds){
        this.age=seconds/(31557600*84.016846);
        return age;
    }
    public double ageOnNeptune(long seconds){
        this.age=seconds/(31557600*164.79132);
        return age;
    }
    
}
