package TourPackage;

import java.util.Arrays;

public class TourPackage {
    public static void main(String[] args) {
        TourPackageSystem[] tourPackages = new TourPackageSystem[3];

        tourPackages[0] = new TourPackageSystem();
        tourPackages[0].packageID = 1;
        tourPackages[0].destination = "Paris";
        tourPackages[0].price = 2000;

        tourPackages[1] = new TourPackageSystem();
        tourPackages[1].packageID = 2;
        tourPackages[1].destination = "London";
        tourPackages[1].price = 1500;

        tourPackages[2] = new TourPackageSystem();
        tourPackages[2].packageID = 3;
        tourPackages[2].destination = "New York";
        tourPackages[2].price = 2500;

        // Sorting by destination using Comparable
        Arrays.sort(tourPackages);
        System.out.println("Sorted by destination:");
        for (TourPackageSystem tourPackage : tourPackages) {
            System.out.println(tourPackage.destination + " - " + tourPackage.price);
        }

        // Sorting by price using Comparator
        Arrays.sort(tourPackages, new Sortbyprice());
        System.out.println("\nSorted by price:");
        for (TourPackageSystem tourPackage : tourPackages) {
            System.out.println(tourPackage.destination + " - " + tourPackage.price);
        }
    }    
}
