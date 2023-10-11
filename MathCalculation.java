public class MathCalculation {

    public static void main(String[] args) {
    
     double earthRadius = 7600.0; // miles
        double sunRadius = 865000.0; // miles

        double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);

        // Calculate the ratio
        double volumeRatio = sunVolume / earthVolume;

        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
    }
    }
