package examples;

public class Volumes {
  public static void main(String[] args) {
    float eRadius = 6371000.0F; // earth radius
    float hRadius = 37.1E-12F;  // hydrogen atom radius

    float earthRadiusCubed = eRadius * eRadius *eRadius;
    float hydrogenRadiusCubed = hRadius * hRadius *hRadius;

    float eVolf = 0.0F;         // earth volume (float)
    float hVolf = 0.0F;         // hydrogen volume (float)
    float ehRatiof = 0.0F;      // earth to hydrogen ratio (float)
    float heRatiof = 0.0F;      // hydrogen to earth ratio (float)

    double eVold = 0.0;         // earth volume (double)
    double hVold = 0.0;         // hydrogen volume (double)
    double ehRatiod = 0.0;      // earth to hydrogen ratio (double)
    double heRatiod = 0.0;      // hydrogen to earth ratio (double)


    eVolf = (4.0F / 3.0F) * (float) Math.PI * earthRadiusCubed;
    eVold = (4.0 / 3.0) * Math.PI * earthRadiusCubed;

    hVolf = (4.0F / 3.0F) * (float) Math.PI * hydrogenRadiusCubed;
    hVold = (4.0 / 3.0) * Math.PI * hydrogenRadiusCubed;

    ehRatiof = eVolf / hVolf;
    ehRatiod = eVold / hVold;

    heRatiof = hVolf / eVolf;
    heRatiod = hVold / eVold;

    System.out.println("        Earth                  Hydrogen");
    System.out.println("float:  " + eVolf + "          " + hVolf);
    System.out.println("double: " + eVold + "  " + hVold);

    System.out.println();
    System.out.println("        E/H Ratio           H/E Ratio");
    System.out.println("float:  " + ehRatiof + "            " +
      heRatiof);
    System.out.println("double: " + ehRatiod + " " + heRatiod);
  }
}
